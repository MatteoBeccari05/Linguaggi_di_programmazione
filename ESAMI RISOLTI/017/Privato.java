import java.util.*;

public class Privato extends Scontrino {

  private String nome;

  private String codiceFiscale;


  public Privato(int id, int giorno,
  int mese,int anno,String nome, String indirizzo, String codiceFiscale,
  int codice){
    super(id,giorno,mese,anno, indirizzo,codice);
    this.nome = nome;
    this.codiceFiscale = codiceFiscale;
  }

  public String toString(){
	  return id + "\t"+giorno+"/"+mese+"/"+anno+"\t" + nome + "\t" + indirizzo + "\t" +
    codiceFiscale +"-\t-\t-\t"+codice;
  }
}
