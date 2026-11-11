
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class Automobile extends Automezzo {
    
    private String tipologia;
    private int n_porte;

    public Automobile(String tipologia, int n_porte, String modello, String n_telaio, int n_posti, int cavalli, Filiale filiale_attuale, float cilindrata, List<Filiale> filiali_passate) {
        super(modello, n_telaio, n_posti, cavalli, filiale_attuale, cilindrata, filiali_passate);
        this.tipologia = tipologia;
        this.n_porte = n_porte;
    }

    public String toString() {
        return "auto\t" + super.toString()+ "\t" + tipologia + "\t" + n_porte + "\t-\t-";
    }
    
    
}
