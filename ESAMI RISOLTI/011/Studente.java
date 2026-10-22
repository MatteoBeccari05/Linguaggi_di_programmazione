public class Studente extends Iscritto {
    private double votoMedio;

    public Studente(int codice, String nomeCognome, int eta, String indirizzo, double votoMedio) {
        super(codice, nomeCognome, eta, indirizzo);
        this.votoMedio = votoMedio;
    }

    public double getVotoMedio() {
        return votoMedio;
    }

    @Override
    public String getTipo() {
        return "studente";
    }

    public int getNumeroContatti() {
        return getContatti().size();
    }
}