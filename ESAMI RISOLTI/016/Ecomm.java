import java.io.*;
import java.util.*;



/*
 * To change this license header\tchoose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Ecomm {


    public static void main(String[] args) {
     List<Cliente> clienti = new LinkedList<Cliente>();
     List<Vendita> vendite = new LinkedList<Vendita>();
    Map<Integer,String> ind = new HashMap<Integer,String>();
    Map<Integer,Cliente> cod_cli = new HashMap<Integer,Cliente>();

        //PUNTO 1: lettura clienti
        try {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();
            String indirizzo;
            while (line != null) {
              Cliente n;
              StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
              String tipo=tok.nextToken();
                if (tipo.equals("privato")) {
                  String nomeCognome=br.readLine();
                  String carta=br.readLine();
                 indirizzo = br.readLine();
                    n = new Privato(cod,indirizzo,nomeCognome,carta);
                } else {
                  String ragioneSociale=br.readLine();
                  StringTokenizer tokss = new StringTokenizer(br.readLine());
                  int partitaIva=Integer.parseInt(tokss.nextToken());
                  int ndip=Integer.parseInt(tokss.nextToken());
                  String IBAN = br.readLine();
                 indirizzo = br.readLine();
                    n = new Azienda(cod,indirizzo,ragioneSociale,IBAN,partitaIva,
                    ndip);
                }
                clienti.add(n);
                ind.put(cod,indirizzo);
                cod_cli.put(cod,n);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

//PUNTO 2: lettura vendite
int somma_n_prodotti=0,somma_prezzi=0,ven=0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("vendite.txt"));
            String line = br.readLine();
            while (line != null) {
              ven++;
              StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                int cli = Integer.parseInt(tok.nextToken());
                String data = br.readLine();
                  String descrizione = br.readLine();
                  int quantita = Integer.parseInt(br.readLine());
                  int prezzo = Integer.parseInt(br.readLine());
                  somma_n_prodotti=somma_n_prodotti+quantita;
                  somma_prezzi=somma_prezzi+prezzo;
                  Vendita v = new Vendita(cod,cli,data,descrizione,quantita,prezzo);
                  vendite.add(v);
                  cod_cli.get(cli).addVendita(quantita*prezzo);
             line = br.readLine();
                }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println();

        //PUNTO 3: stampa di tutti i clienti
        System.out.println("Tipo\tID\tNome e Cognome\tNumero Carta di Credito"+
"\tRagione Sociale\tPartita Iva\tDipendenti\tIBAN\tindirizzo");
        for (Cliente c : clienti)
            System.out.println(c);


        //PUNTO 4: stampa delle vendite
        System.out.println("Codice Vendita\t"+
"Codice Cliente\tIndirizzo Cliente\tData\tDescrizione Prodotto\t"+
"Quantità\tPrezzo Unitario\tTotale\tTotale Iva Esclusa");
        for (Vendita v : vendite)
          System.out.println(v.getCodice()+"\t"+v.getCodiceCli()+"\t"+
          ind.get(v.getCodiceCli())+"\t"+v);

        //PUNTO 5: stampa del totale spese
        System.out.println("Stampa spese\n");
        for (Cliente c : clienti)
              System.out.println(c.getCodice()+"\t"+c.getTotale());

// punto 6
double media_prod=(double) somma_n_prodotti/ven;
double media_prezzi=(double) somma_prezzi/ven;
System.out.println("Media n. prodotti "+media_prod);
System.out.println("Media prezzi "+media_prezzi);

    }//main


}
