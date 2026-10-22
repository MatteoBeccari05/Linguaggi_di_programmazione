


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Riga {
    private int codiceScontrino, codiceNegozio;
    private String data,descrizione;
    int quantita, prezzo, totale;

    public Riga(int codiceScontrino, int codiceNegozio, String data, String descrizione, int quantita, int prezzo) {
        this.codiceScontrino = codiceScontrino;
        this.codiceNegozio = codiceNegozio;
        this.data = data;
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzo = prezzo;
        totale=quantita*prezzo;
    }

    public int getTotale() {
        return totale;
    }

    public String toString() {
        return codiceScontrino + "\t" + data + "\t" + descrizione+ "\t" + quantita+ "\t" + prezzo+"\t" +totale;
    }


}
