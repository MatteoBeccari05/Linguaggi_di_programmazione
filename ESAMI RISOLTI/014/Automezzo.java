
import java.util.ArrayList;
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
public class Automezzo {
    
    private String modello, n_telaio;
    private int n_posti, cavalli;
    private float cilindrata;
    private Filiale filiale_attuale;
    private List<Filiale> filiali_passate;

    public Automezzo(String modello, String n_telaio, int n_posti, int cavalli, Filiale filiale_attuale, float cilindrata, List<Filiale> filiali_passate) {
        this.modello = modello;
        this.n_telaio = n_telaio;
        this.n_posti = n_posti;
        this.cavalli = cavalli;
        this.filiale_attuale = filiale_attuale;
        this.cilindrata = cilindrata;
        this.filiali_passate = filiali_passate;
    }

    

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getN_telaio() {
        return n_telaio;
    }

    public void setN_telaio(String n_telaio) {
        this.n_telaio = n_telaio;
    }

    public int getN_posti() {
        return n_posti;
    }

    public void setN_posti(int n_posti) {
        this.n_posti = n_posti;
    }

    public int getCavalli() {
        return cavalli;
    }

    public void setCavalli(int cavalli) {
        this.cavalli = cavalli;
    }

    public Filiale getFiliale_attuale() {
        return filiale_attuale;
    }

    public void setFiliale_attuale(Filiale filiale_attuale) {
        this.filiale_attuale = filiale_attuale;
    }

    public float getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(float cilindrata) {
        this.cilindrata = cilindrata;
    }

    public List<Filiale> getFiliali_passate() {
        return filiali_passate;
    }

    public void setFiliali_passate(List<Filiale> filiali_passate) {
        this.filiali_passate = filiali_passate;
    }
    
    public String toString() {
        return getModello() + "\t" + getN_telaio() + "\t" + getN_posti() 
                + "\t" + getCilindrata() + "\t" + getCavalli();
    }
    
    
}
