import java.io.*;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Cliente {

    protected int codice;
    protected String indirizzo;
    protected int totale_acquisti;

    public Cliente(int codice, String indirizzo) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        this.totale_acquisti=0;
    }

    public int getCodice() {
        return codice;
    }
  public int getTotale() {
      return totale_acquisti;
  }
    public void addVendita(int a) {
        totale_acquisti=totale_acquisti+a;
    }


    public String toString() {
        return  indirizzo;
    }


}
