import java.util.*;

public class Stampante extends Prodotto {
	
  private int peso;
  
  public Stampante(int id, String modello, String produttore, int giorno,
  int mese,int anno,int prezzo, int peso){
    super(id,modello,produttore,giorno,mese,anno,prezzo);
    this.peso = peso;
  }
  
  public String toString(){
	  return "Stampante" + "\t" + id + "\t" + modello + "\t" + produttore + "\t" + giorno 
    +"-"+mese+"-"+anno+"\t"+prezzo + "\t-\t"+peso;
  }
}
