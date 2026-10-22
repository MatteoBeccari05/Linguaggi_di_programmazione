import java.util.*;

public class Orale extends Appello {
	
  private int max;
  
  public Orale(int id, String docente, String corso, int giorno,
  int mese,int anno,int ora, int max){
    super(id,docente,corso,giorno,mese,anno,ora);
    this.max = max;
  }
  
  public String toString(){
	  return "orale" + "\t" + id + "\t" + docente + "\t" + corso + "\t" + giorno 
    +"-"+mese+"-"+anno+"\t"+ora + "\t-\t-\t" + max;
  }
}
