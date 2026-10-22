import java.io.*;
import java.util.*;

public class Gestione {

  public static void main(String[] args) {
    List<Appello> appelli = new LinkedList<Appello>();
       Map<String,Integer> appelli_docente = new HashMap<String,Integer>();

        //PUNTO 1: memorizzazione prodotti
        try {
            BufferedReader br = new BufferedReader(new FileReader("appelli.txt"));
            String line=br.readLine(); //prima riga: tipo+codice
            while (line!= null){
            	//lettura di 1 appello
            	StringTokenizer tokenizer = new StringTokenizer(line);
                String type         = tokenizer.nextToken();
                int id              = Integer.parseInt(tokenizer.nextToken());
                String docente		= br.readLine();
                String corso       = br.readLine();
                line=br.readLine(); 
            	  tokenizer = new StringTokenizer(line);  
                int giorno              = Integer.parseInt(tokenizer.nextToken());
                int mese              = Integer.parseInt(tokenizer.nextToken());
                int anno              = Integer.parseInt(tokenizer.nextToken());
                int ora          = Integer.parseInt(br.readLine());
                
                /* PUNTO 3 */
              	Integer app = appelli_docente.get(docente);
        		if (app==null)
        			appelli_docente.put(docente, new Integer(1));
        		else
        			appelli_docente.put(docente, new Integer(app+1));
                
                    if (type.equals("scritto")) {
                String aula       = br.readLine();
                int durata          = Integer.parseInt(br.readLine());
                        Appello a = new Scritto(id, docente, corso, giorno, mese,anno,ora,aula,durata);
                        appelli.add(a);
                    } else {
                int max          = Integer.parseInt(br.readLine());
                        Appello a = new Orale(id, docente, corso, giorno, mese,anno,ora,max);
                    	appelli.add(a);
                    }
                    line = br.readLine(); 
                    line = br.readLine(); 
            }//while
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        catch (Exception e) {
			System.err.println(e);
        }
  		//PUNTO 2
		System.out.println("Tipo\tCodice\tDocente\tCorso\tData\tOra\tAula\tDurata\tStudentiMax");
  		for (Appello a: appelli)
  			System.out.println(a);
    	
        //PUNTO 3
        System.out.println("\nN. appelli per docente");        
        System.out.println(appelli_docente);

		//PUNTO 4
		int ora_max = 0;
  		for (Appello a: appelli)
        if (a.getOra()>ora_max)
          ora_max=a.getOra();
    	System.out.println("\nOra max = " + ora_max);
    	
    }//main   
}//class
