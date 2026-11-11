/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Film extends Spettacolo {
    
    private String durata;

    public Film(String titolo, int codice, String durata, String produttore, int anno) {
        super(titolo, codice, produttore, anno);
        this.durata = durata;
    }
    
   public String toString() {
       return "Film\t" + this.getTitolo() + "\t" + this.getCodice() +
               "\t-\t-\t" + durata + "\t" + this.getAnno() +
               "\t" + this.getProduttore();
   }
}
