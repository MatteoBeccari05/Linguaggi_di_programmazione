

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class CityStore extends Negozio {

    private String responsabile, codiceFiscale;

    public CityStore(int codice, String indirizzo, int superficie, String responsabile,  String codiceFiscale) {
        super(codice, indirizzo, superficie);
        this.responsabile = responsabile;
        this.codiceFiscale = codiceFiscale;
    }

    public String toString() {
        return "city-store\t" + super.toString()+ "\t" + responsabile + "\t" + codiceFiscale + "\t-\t-\t-";
    }


}
