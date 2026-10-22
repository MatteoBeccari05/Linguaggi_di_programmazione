import java.util.*;

public class Azienda extends Cliente {
	
  private int fatturato;
  private String ragioneSociale;
  
  public Azienda(int id, String ragioneSociale, String indirizzo, 
   int giorno,
  int mese,int anno,int fatturato){
    super(id,indirizzo,giorno,mese,anno);
    this.ragioneSociale = ragioneSociale;
    this.fatturato = fatturato;
  }
  
  public String toString(){
	  return "Azienda" + "\t" + id +"\t" + "-"+ "\t" + ragioneSociale + "\t" 
     + indirizzo + "\t" + giorno 
    +"/"+mese+"/"+anno+"\t"+fatturato;
  }
}
