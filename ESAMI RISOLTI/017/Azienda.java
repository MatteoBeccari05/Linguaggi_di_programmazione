import java.util.*;

public class Azienda extends Scontrino {

  private String ragioneSociale;
  private int partitaIva;

  public Azienda(int id, int giorno,
  int mese,int anno,String ragioneSociale, int partitaIva,int codice,
  String indirizzo){
    super(id,giorno,mese,anno,indirizzo,codice);
    this.ragioneSociale = ragioneSociale;
    this.partitaIva = partitaIva;
  }

  public String toString(){
	  return id +"\t"+giorno +"/"+mese+"/"+anno+ "\t-\t"+indirizzo+"\t-\t"
   +ragioneSociale+"\t"+partitaIva+"\t"+codice;
  }
}
