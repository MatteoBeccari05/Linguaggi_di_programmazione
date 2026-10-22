import java.util.*;

public class Toner extends Prodotto {
	
  private String modelloStampante;
  
  public Toner(int id, String modello, String produttore, int giorno,
  int mese,int anno,int prezzo, String modelloStampante){
    super(id,modello,produttore,giorno,mese,anno,prezzo);
    this.modelloStampante = modelloStampante;
  }
  
  public String toString(){
	  return "Toner" + "\t" + id + "\t" + modello + "\t" + produttore + "\t" + giorno 
    +"-"+mese+"-"+anno+"\t"+prezzo + "\t"+modelloStampante+"\t-";
  }
}
