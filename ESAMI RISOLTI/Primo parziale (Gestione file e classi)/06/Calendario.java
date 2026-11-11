import java.util.*;
import java.io.*;

public class Calendario
{
  public static void main(String[] args)
  {
    List<Partita> partite=new LinkedList<Partita>();
    Map<String,Integer> p_vinte=new HashMap<String,Integer>(); 
    int casa = 0; 
    int fuoricasa = 0;
	int vinte_casa = 0; int vinte_fuoricasa = 0;
    int trovato = 0;
    try
    {
      //PUNTO 1
      FileReader f=new FileReader("partite.txt");
      BufferedReader bf= new BufferedReader(f);
      String line=bf.readLine();
      while (line!= null)
      {
        StringTokenizer tokenizer=new StringTokenizer(line);
        String tipo=tokenizer.nextToken(); //c o f
        String pal_citta=tokenizer.nextToken();
        String data=tokenizer.nextToken();
        String ora=tokenizer.nextToken();  
        String risultato=tokenizer.nextToken();
        int vinta=Integer.parseInt(tokenizer.nextToken());
        
        if (tipo.equals("c"))
        {          
          Partita p=new InCasa(pal_citta,data,ora,risultato,vinta);
          partite.add(p);
          casa++;
        }
        else
        {
          Partita p=new FuoriCasa(pal_citta,data,ora,risultato,vinta);
          partite.add(p);
          fuoricasa++;
        }
        line=bf.readLine();
      }
    }
    catch (IOException ex)
    {
      System.out.println(ex);
    }
    
    
    
    //PUNTO 2
    System.out.println("Palazzetto\tCitta'\tData\tOra\tRisultato");
    for (Partita p : partite)
      System.out.println(p);
    
    //PUNTO 3, due soluzioni alternative, con HASHMAP o CONTATORE
    System.out.println("\nPARTITE GIOCATE E VINTE");
    
    /* USO HASHMAP */
   for (Partita p : partite){
    		if (p instanceof InCasa)
    		{
				int vinta = p.getVinta(); //recupera ultimo campo
				if (vinta == 1) {            	
					Integer n=p_vinte.get(casa+" partite in casa");
					if (n==null)
						p_vinte.put(casa+" partite in casa",1);
					else
						p_vinte.put(casa+" partite in casa",n+1);
				}
            }
           else {
           		int vinta = p.getVinta(); //recupera ultimo campo
				if (vinta == 1) {            	
					Integer n=p_vinte.get(fuoricasa+" partite fuori casa");
					if (n==null)
						p_vinte.put(fuoricasa+" partite fuori casa",1);
					else
						p_vinte.put(fuoricasa+" partite fuori casa",n+1);
				}
			}   
    }//for
    System.out.println(p_vinte);
    
    
    /* USO CONTATORE */
    for (Partita p : partite){
    		if (p instanceof InCasa)
    		{
				int vinta = p.getVinta(); //recupera ultimo campo
				if (vinta == 1) {            	
					vinte_casa++;
				}
            }
           else {
           		int vinta = p.getVinta(); //recupera ultimo campo
				if (vinta == 1) {            	
					vinte_fuoricasa++;
				}
			}   
    }//for
    System.out.println(casa+" partite in casa, di cui vinte " + vinte_casa + ". " + fuoricasa +" partite fuori casa, di cui vinte " + vinte_fuoricasa + ".");
    
    //PUNTO 4
    
    for (Partita p : partite){
    if (p instanceof FuoriCasa)
    {
        String citta = ((FuoriCasa)p).getCitta();
        if (citta.equals(args[0])) {
        	System.out.println(p);
        	trovato = 1;
        	}
   	 } //if
   	}
   	if (trovato == 0)
   	 	 System.out.println("\n Partita a " + args[0] + " non ancora giocata");
  }
}