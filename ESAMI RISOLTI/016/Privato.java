

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Privato extends Cliente {

    private String nomeCognome;
    String carta;

    public Privato(int codice, String indirizzo, String nomeCognome,
    String carta) {
        super(codice, indirizzo);
        this.nomeCognome = nomeCognome;
        this.carta = carta;
    }

    public String toString() {
        return "privato\t" +codice+"\t"+nomeCognome+"\t"+carta+ "\t-\t-\t-\t-\t"
        +super.toString();
    }


}
