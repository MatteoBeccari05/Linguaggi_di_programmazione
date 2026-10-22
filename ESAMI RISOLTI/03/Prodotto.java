import java.util.*;

public class Prodotto {
	
	protected int id; //codice
	protected String titolo;
	protected String autori;
	protected int prezzo;
	
	public Prodotto(int id, String titolo, String autori, int prezzo){
		this.id = id;
		this.titolo = titolo;
		this.autori = autori;
		this.prezzo = prezzo;
	}
	
	public int getPrezzo(){
		return prezzo;
	}
}
