/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Serie extends Spettacolo{
    
    private int stagione, puntate;

    public Serie(String titolo, int codice, int stagione, int puntate, String produttore, int anno) {
        super(titolo, codice, produttore, anno);
        this.stagione = stagione;
        this.puntate = puntate;
    }
    
    public String toString() {
       return "Film\t" + this.getTitolo() + "\t" + this.getCodice() +
               "\t" + stagione + "\t" + puntate + "\t-\t" + this.getAnno() +
               "\t" + this.getProduttore();
   }
    
}
