import java.util.*;

public class Privato extends Cliente {
	
  private String nome;
  
  public Privato(int id,  String nome, String indirizzo,  int giorno,
  int mese,int anno){
    super(id,indirizzo,giorno,mese,anno);
    this.nome = nome;
  }
  
  public String toString(){
	  return "Privato" + "\t" + id + "\t" + nome + "\t" + "-" + "\t"
     + indirizzo + "\t" + giorno 
    +"/"+mese+"/"+anno+"\t"+"-";
  }
}
