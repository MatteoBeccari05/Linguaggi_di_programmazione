import java.io.*;
import java.util.*;

public class Magazzini {

  public static void main(String[] args) {
    List<Prodotto> prodotti = new LinkedList<Prodotto>();
       Map<String,Integer> totPezzi = new HashMap<String,Integer>();
       Map<String,Float> avPezzi = new HashMap<String,Float>();

        //PUNTO 1: memorizzazione prodotti
        try {
            BufferedReader br = new BufferedReader(new FileReader("inventario.txt"));
            String line=br.readLine(); //prima riga: tipo+codice
            while (line!= null){
            	//lettura di 1 appello
            	StringTokenizer tokenizer = new StringTokenizer(line);
                String type         = tokenizer.nextToken();
                int id              = Integer.parseInt(tokenizer.nextToken());
                String modello		= br.readLine();
                String produttore       = br.readLine();
                line=br.readLine(); 
            	  tokenizer = new StringTokenizer(line);  
                int giorno              = Integer.parseInt(tokenizer.nextToken());
                int mese              = Integer.parseInt(tokenizer.nextToken());
                int anno              = Integer.parseInt(tokenizer.nextToken());
                int prezzo          = Integer.parseInt(br.readLine());
                
                
                    if (type.equals("toner")) {
                String modelloStampante       = br.readLine();
                        Prodotto p = new Toner(id, modello, produttore, giorno, mese,anno,prezzo,modelloStampante);
                        prodotti.add(p);
                    } else {
                int peso          = Integer.parseInt(br.readLine());
                        Prodotto p = new Stampante(id, modello, produttore, giorno, mese,anno,prezzo,peso);
                        prodotti.add(p);
                    }
                    line = br.readLine(); 
                    int i=0, pezziTot=0;
                    while (line!= null && !line.isEmpty()){
                      int pezzi =Integer.parseInt(line);
                      i=i+1;
                      pezziTot=pezziTot+pezzi;
                      line = br.readLine(); 
                    }
                /* PUNTO 3 */        		
        			totPezzi.put(modello, new Integer(pezziTot));
                /* PUNTO 4 */        		
        			avPezzi.put(modello, new Float(((float)pezziTot)/i));
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
		System.out.println("Tipo\tCodice\tModello\tProduttore\tData\tPrezzo\tModelloStampante\tPeso");
  		for (Prodotto p: prodotti)
  			System.out.println(p);
    	
        //PUNTO 3
        System.out.println("\nN. pezzi di ciascun modello");        
        System.out.println(totPezzi);

        //PUNTO 4
        System.out.println("\nN. medio pezzi per magazzino di ciascun modello");        
        System.out.println(avPezzi);
    }//main   
}//class
