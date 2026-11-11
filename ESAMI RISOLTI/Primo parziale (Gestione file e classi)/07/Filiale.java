import java.io.*;
import java.util.*;

public class Filiale {

  public static void main(String[] args) {
    List<Cliente> clienti = new LinkedList<Cliente>();
       Map<String,Integer> sommaPremi = new HashMap<String,Integer>();
     int premioMax=0;
     String clientePremioMax="";
        //PUNTO 1: memorizzazione prodotti
        try {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line=br.readLine(); //prima riga: tipo+codice
            while (line!= null){
            	//lettura di 1 appello
            	StringTokenizer tokenizer = new StringTokenizer(line);
                String type         = tokenizer.nextToken();
                int id              = Integer.parseInt(tokenizer.nextToken());
                String indirizzo	= br.readLine();
                line=br.readLine(); 
            	  tokenizer = new StringTokenizer(line);  
                int giorno              = Integer.parseInt(tokenizer.nextToken());
                int mese              = Integer.parseInt(tokenizer.nextToken());
                int anno              = Integer.parseInt(tokenizer.nextToken());
                String nomeRagioneSociale       = br.readLine();


                
                
                    if (type.equals("privato")) {
                        Cliente c = new Privato(id, nomeRagioneSociale, indirizzo, giorno, mese,anno);
                        clienti.add(c);
                    } else {
                int fatturato          = Integer.parseInt(br.readLine());
                Cliente a = new Azienda(id, nomeRagioneSociale, indirizzo,
                giorno, mese,anno,fatturato);
                        clienti.add(a);
                    }
                    line = br.readLine(); 
                    int premiTot=0;
                    while (line!= null && !line.isEmpty()){
                      int premio =Integer.parseInt(line);
                      premiTot=premiTot+premio;
                      line = br.readLine(); 
                    }
                /* PUNTO 3 */        		
        			sommaPremi.put(nomeRagioneSociale, new Integer(premiTot));
                /* PUNTO 4 */        		
                      line = br.readLine(); 
                if (premioMax<premiTot)
                {premioMax=premiTot;
                clientePremioMax=nomeRagioneSociale;}
            }//while
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        catch (Exception e) {
			System.err.println(e);
        }
  		//PUNTO 2
		System.out.println("Tipo\tCodice\tNome\tRagioneSociale\tIndirizzo\tData\tFatturato");
  		for (Cliente c: clienti)
  			System.out.println(c);
    	
        //PUNTO 4
        System.out.println("\nSomme dei premi per cliente");        
        System.out.println(sommaPremi);

        //PUNTO 4
        System.out.println("\nCliente con massima somma dei premi");        
        System.out.println(clientePremioMax);

    }//main   
}//class
