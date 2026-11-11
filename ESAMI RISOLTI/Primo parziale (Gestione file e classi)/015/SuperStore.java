

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class SuperStore extends Negozio {

    private String ragioneSociale;
    private int partitaIva, casse;

    public SuperStore(int codice, String indirizzo, int superficie, String ragioneSociale,int partitaIva, int casse) {
        super(codice, indirizzo, superficie);
        this.ragioneSociale = ragioneSociale;
        this.partitaIva = partitaIva;
        this.casse = casse;
    }

    public String toString() {
        return "super store\t" + super.toString()+ "\t-\t-\t" + ragioneSociale + "\t" + partitaIva+ "\t"+casse;
    }


}
