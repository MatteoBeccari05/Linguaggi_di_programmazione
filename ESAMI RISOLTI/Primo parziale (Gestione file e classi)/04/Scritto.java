import java.util.*;

public class Scritto extends Appello {
	
  private int durata;
  private String aula;
  
  public Scritto(int id, String docente, String corso, int giorno,
  int mese,int anno,int ora, String aula, int durata){
    super(id,docente,corso,giorno,mese,anno,ora);
    this.durata = durata;
    this.aula = aula;
    
  }
  
  public String toString(){
	  return "scritto" + "\t" + id + "\t" + docente + "\t" + corso + "\t" + giorno 
    +"-"+mese+"-"+anno+"\t"+ora + "\t"+aula+"\t"+durata+"\t-";
  }
}
