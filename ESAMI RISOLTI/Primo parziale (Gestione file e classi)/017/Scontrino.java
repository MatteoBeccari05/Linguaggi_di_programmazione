import java.util.*;

public class Scontrino {

	protected int id; //codice
	protected int giorno;
	protected int mese;
	protected int anno;
	protected String indirizzo;
	protected int codice;


	public Scontrino(int id, int giorno,
  int mese,int anno, String indirizzo, int codice){
		this.id = id;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
		this.indirizzo = indirizzo;
		this.codice=codice;
	}
}
