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
public class Catena {


    public static void main(String[] args) {
     List<Negozio> negozi = new LinkedList<Negozio>();
    Map<Integer,Negozio> cod_neg = new HashMap<Integer,Negozio>();
    Map<Negozio,Integer> neg_tot = new HashMap<Negozio,Integer>();

        //PUNTO 1: lettura negozi
        try {
            BufferedReader br = new BufferedReader(new FileReader("negozi.txt"));
            String line = br.readLine();
            while (line != null) {
              Negozio n;
              StringTokenizer tok = new StringTokenizer(line);
              String tipo=tok.nextToken();
                int cod = Integer.parseInt(tok.nextToken());
                String indirizzo = br.readLine();
                if (tipo.equals("city-store")) {
                  String responsabile=br.readLine();
                  String cf=br.readLine();
                  int superficie = Integer.parseInt(br.readLine());
                    n = new CityStore(cod,indirizzo,superficie,responsabile,cf);
                } else {
                  String ragioneSociale=br.readLine();
                  StringTokenizer tokss = new StringTokenizer(br.readLine());
                  int partitaIva=Integer.parseInt(tokss.nextToken());
                  int casse=Integer.parseInt(tokss.nextToken());
                  int superficie = Integer.parseInt(br.readLine());
                    n = new SuperStore(cod,indirizzo,superficie,ragioneSociale,partitaIva,casse);
                }
                negozi.add(n);
                cod_neg.put(cod,n);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

//PUNTO 1: lettura scontrini

        try {
            BufferedReader br = new BufferedReader(new FileReader("scontrini.txt"));
            String line = br.readLine();
            while (line != null) {
              StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                int neg = Integer.parseInt(tok.nextToken());
                Negozio negozio=cod_neg.get(neg);
                String data = br.readLine();
                line = br.readLine();
                while (line!= null && !line.isEmpty()){
                  String descrizione = line;
                  StringTokenizer tokr = new StringTokenizer(br.readLine());
                  int quantita = Integer.parseInt(tokr.nextToken());
                  int prezzo = Integer.parseInt(tokr.nextToken());
                  Riga r = new Riga(cod,neg,data,descrizione,quantita,prezzo);
                  negozio.addRiga(r);
                  line=br.readLine();
                }
                line = br.readLine();
              }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println();

        //PUNTO 3: stampa di tutti i negozi
        System.out.println("Tipo\tID\tIndirizzo\tNome e Cognome Responsabile\tCodice Fiscale\tRagione Sociale\tPartita Iva\tSuperficie");
        for (Negozio n : negozi)
            System.out.println(n);


        //PUNTO 4: righe scontrini
        System.out.println("Stampa delle righe degli scontrini per ogni negozio\n");
        for (Negozio n : negozi)
            n.stampaRighe();


        //PUNTO 5: stampa del fatturato per superficie
        System.out.println("Stampa fatturato\n");
        for (Negozio n : negozi)
            n.stampaFatturatoPerSuperficie();


    }//main


}
