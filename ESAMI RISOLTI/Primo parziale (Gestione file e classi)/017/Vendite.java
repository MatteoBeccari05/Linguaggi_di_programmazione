import java.io.*;
import java.util.*;

public class Vendite {

  public static void main(String[] args) {
    List<Scontrino> scontrini = new LinkedList<Scontrino>();
    List<Prodotto> prodotti = new LinkedList<Prodotto>();
       Map<String,Integer> totali = new HashMap<String,Integer>();
       Map<Integer,Integer> tot_cli = new HashMap<Integer,Integer>();

        //PUNTO 1: memorizzazione prodotti
        try {
            BufferedReader br = new BufferedReader(new FileReader("scontrini.txt"));
            String line=br.readLine(); //prima riga: tipo+codice
            while (line!= null){
            	//lettura di 1 appello
                String nome;
                String indirizzo;
                String codiceFiscale;
                String ragioneSociale;
                int partitaIva;
                int codice;
            	StringTokenizer tokenizer = new StringTokenizer(line);
                String type         = tokenizer.nextToken();
                int id              = Integer.parseInt(tokenizer.nextToken());
                    line = br.readLine();
            	  tokenizer = new StringTokenizer(line);
                int giorno              = Integer.parseInt(tokenizer.nextToken());
                int mese              = Integer.parseInt(tokenizer.nextToken());
                int anno              = Integer.parseInt(tokenizer.nextToken());
                if (type.equals("privato"))
                {
                nome		= br.readLine();
                indirizzo       = br.readLine();
                tokenizer = new StringTokenizer(br.readLine());
                codiceFiscale=tokenizer.nextToken();
                ragioneSociale=null;
                partitaIva=0;
                codice=Integer.parseInt(tokenizer.nextToken());

                } else {
                ragioneSociale=br.readLine();
                partitaIva = Integer.parseInt(br.readLine());
                codice = Integer.parseInt(br.readLine());
                nome		= null;
                indirizzo       = br.readLine();
                codiceFiscale=null;
                }
                    line = br.readLine();
                    while (line!= null && !line.isEmpty()){
                      String descrizione=line;
            	                      line = br.readLine();
          tokenizer = new StringTokenizer(line);
                      int pezzi =Integer.parseInt(tokenizer.nextToken());
                      int prezzo=Integer.parseInt(tokenizer.nextToken());
                      int tot_pr=pezzi*prezzo;
                      Prodotto p= new Prodotto(descrizione,pezzi,prezzo,tot_pr);
                      prodotti.add(p);
                      Integer tot = totali.get(descrizione);
              		if (tot==null)
              			totali.put(descrizione, new Integer(tot_pr));
              		else
              			totali.put(descrizione, new Integer(tot+tot_pr));
                      line = br.readLine();
                      Integer tot_cl=tot_cli.get(codice);
                      //System.out.println(id+" "+tot_cl+" "+tot_pr);
                      if (tot_cl==null)
                      tot_cli.put(codice, new Integer(tot_pr));
                    else
                      tot_cli.put(codice, new Integer(tot_cl+tot_pr));
                    }
                    if (type.equals("privato")) {
                        Scontrino t = new Privato(id, giorno, mese,anno,nome, indirizzo, codiceFiscale,
                        codice);
                        scontrini.add(t);
                    } else {
                        Scontrino t = new Azienda(id, giorno, mese,anno,ragioneSociale,
                        partitaIva,codice,indirizzo);
                        scontrini.add(t);
                    }
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
		System.out.println("ID\tData\tNome\tIndirizzo\tCodiceFiscale\tRagioneSociale\tPartitaIva\tCodiceCliente");
  		for (Scontrino t: scontrini)
  			System.out.println(t);

    // punto 3
    for (Prodotto p:prodotti)
  			System.out.println(p);

        //PUNTO 4
        			System.out.println(totali);

        //PUNTO 5
        int cod = Integer.parseInt(args[0]);
        System.out.println("\nTotale cliente "+cod+": "+tot_cli.get(cod));
    }//main
}//class
