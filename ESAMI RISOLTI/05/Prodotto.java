import java.util.*;

public class Prodotto {
	
	protected int id; //codice
	protected String modello;
	protected String produttore;
	protected int giorno;
	protected int mese;
	protected int anno;
	protected int prezzo;
	
	public Prodotto(int id, String modello, String produttore, int giorno,
  int mese,int anno,int prezzo){
		this.id = id;
		this.modello = modello;
		this.produttore = produttore;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
		this.prezzo = prezzo;
	}
}
