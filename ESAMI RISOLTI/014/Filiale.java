
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
public class Filiale {
    private int codice, n_addetti;
    private String nome, indirizzo;
    List<Automezzo> automezzi;

    public Filiale(int codice, int n_addetti, String nome, String indirizzo) {
        this.codice = codice;
        this.n_addetti = n_addetti;
        this.nome = nome;
        this.indirizzo = indirizzo;
        
        automezzi = new ArrayList<>();
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getN_addetti() {
        return n_addetti;
    }

    public void setN_addetti(int n_addetti) {
        this.n_addetti = n_addetti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    public void addAutomezzo(Automezzo a) {
        this.automezzi.add(a);
    }

    public List<Automezzo> getAutomezzi() {
        return automezzi;
    }

    public void setAutomezzi(List<Automezzo> automezzi) {
        this.automezzi = automezzi;
    }

    @Override
    public String toString() {
        return nome + "\n" + indirizzo + "\nAddetti: " + n_addetti;
    }
    
    
}
