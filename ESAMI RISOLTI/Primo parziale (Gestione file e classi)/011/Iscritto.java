import java.util.ArrayList;
import java.util.List;

public abstract class Iscritto {
    private int codice;
    private String nomeCognome;
    private int eta;
    private String indirizzo;
    private List<Iscritto> contatti;

    public Iscritto(int codice, String nomeCognome, int eta, String indirizzo) {
        this.codice = codice;
        this.nomeCognome = nomeCognome;
        this.eta = eta;
        this.indirizzo = indirizzo;
        this.contatti = new ArrayList<>();
    }

    public int getCodice() {
        return codice;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public int getEta() {
        return eta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public List<Iscritto> getContatti() {
        return contatti;
    }

    public void addContatto(Iscritto contatto) {
        if (contatto != null) {
            this.contatti.add(contatto);
        }
    }

    public abstract String getTipo();
}