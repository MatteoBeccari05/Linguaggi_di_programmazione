


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Vendita {
    private int codice, codiceCli;
    private String data,descrizione;
    int quantita, prezzo, totale;
    double totalesenzaiva;

    public Vendita(int codice, int codiceCli, String data,
    String descrizione, int quantita, int prezzo) {
        this.codice = codice;
        this.codiceCli = codiceCli;
        this.data = data;
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzo = prezzo;
        totale=quantita*prezzo;
        totalesenzaiva=totale/1.22;

    }

    public int getCodice() {
        return codice;
    }
  public int getCodiceCli() {
      return codiceCli;
  }
    public String toString() {
        return  data + "\t" + descrizione+ "\t" + quantita+ "\t" +
        prezzo+"\t" +totale+"\t" +totalesenzaiva;
    }


}
