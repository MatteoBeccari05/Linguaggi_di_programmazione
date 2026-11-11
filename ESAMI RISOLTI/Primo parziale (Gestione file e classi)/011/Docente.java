import java.util.List;

public class Docente extends Iscritto {
    private String corsoPrincipale;

    public Docente(int codice, String nomeCognome, int eta, String indirizzo, String corsoPrincipale) {
        super(codice, nomeCognome, eta, indirizzo);
        this.corsoPrincipale = corsoPrincipale;
    }

    public String getCorsoPrincipale() {
        return corsoPrincipale;
    }

    @Override
    public String getTipo() {
        return "docente";
    }

    public double getMediaEtaContatti() {
        List<Iscritto> contatti = getContatti();
        if (contatti.isEmpty()) {
            return 0.0;
        }
        double sommaEta = 0;
        for (Iscritto c : contatti) {
            sommaEta += c.getEta();
        }
        return sommaEta / contatti.size();
    }
}