
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
public class VeicoloCommerciale extends Automezzo {
    
    private int n_assi;
    private boolean cassone;

    public VeicoloCommerciale(int n_assi, boolean cassone, String modello, String n_telaio, int n_posti, int cavalli, Filiale filiale_attuale, float cilindrata, List<Filiale> filiali_passate) {
        super(modello, n_telaio, n_posti, cavalli, filiale_attuale, cilindrata, filiali_passate);
        this.n_assi = n_assi;
        this.cassone = cassone;
    }

    public String toString() {
        return "v.comm.\t" + super.toString()+ "\t-\t-\t" + n_assi + "\t" + cassone;
    }
    
    
}
