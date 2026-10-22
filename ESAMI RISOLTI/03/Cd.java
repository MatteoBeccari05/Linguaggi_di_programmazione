import java.util.*;

public class Cd extends Prodotto {
	
  private int durata;
  
  public Cd(int id, String titolo, String autori, int prezzo, int durata)
  {
	super(id,titolo,autori,prezzo);
    this.durata = durata;
  }
  
  public String toString(){
	  return "CD" + "\t" + id + "\t" + titolo + "\t" + autori + "\t" + prezzo + "\t-\t" + durata;
  }
}
