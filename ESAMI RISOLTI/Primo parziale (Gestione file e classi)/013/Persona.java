
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
public class Persona {
    
    private int codice;
    private String nome, cognome;
    private List<Spettacolo> visti;

    public Persona(int codice, String nome, String cognome) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.visti = new ArrayList<Spettacolo>();
    }
    
    public void addVisualizzazione(Spettacolo s) {
        visti.add(s);
    }

    public List<Spettacolo> getVisti() {
        return visti;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
    
}
