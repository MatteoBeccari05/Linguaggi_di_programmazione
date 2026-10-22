import java.util.*;

public class Cliente {
	
	protected int id; //codice
	protected String indirizzo;
	protected int giorno;
	protected int mese;
	protected int anno;
	
	public Cliente(int id, String indirizzo, int giorno,
  int mese,int anno){
		this.id = id;
		this.indirizzo = indirizzo;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}
}
