import java.io.*;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Negozio {

    private int codice;
    private String indirizzo;
    private int superficie;
    private List<Riga> righe;
    private int fatturato;

    public Negozio(int codice, String indirizzo, int superficie) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.superficie = superficie;
        this.righe = new  LinkedList<Riga>();
        this.fatturato=0;
    }



    public void addRiga(Riga r) {
        righe.add(r);
        fatturato=fatturato+r.getTotale();
    }

    public void stampaRighe() {
        System.out.println(codice);
        for (Riga r : righe)
          System.out.println(r);
        System.out.println();
    }

    public void stampaFatturatoPerSuperficie() {
      float fattSup=(float)fatturato/superficie;
              System.out.println(codice+" "+fattSup);
  }


    public String toString() {
        return codice + "\t" + indirizzo + "\t" + superficie;
    }


}
