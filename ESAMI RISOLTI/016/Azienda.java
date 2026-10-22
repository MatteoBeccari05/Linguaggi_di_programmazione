

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Azienda extends Cliente {

    private String ragioneSociale, IBAN;
    int piva,ndip;

    public Azienda(int codice, String indirizzo, String ragioneSociale,
    String IBAN,
    int piva, int ndip) {
        super(codice, indirizzo);
        this.ragioneSociale = ragioneSociale;
        this.IBAN=IBAN;
        this.piva = piva;
        this.ndip = ndip;
    }

    public String toString() {
        return "azienda\t" +codice+"\t-\t-\t"+ragioneSociale+"\t"+piva+
        "\t"+ ndip+"\t"+IBAN+"\t"
        +super.toString();
    }


}
