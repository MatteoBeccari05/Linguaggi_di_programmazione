import java.util.*;

public class Azienda extends Iscritto {

  private String ragioneSociale;
  private String gestore;

  public Azienda(int id, String indirizzo,  String account,  String password,
  String ragioneSociale,  String gestore){
    super(id,indirizzo,account,password);
    this.ragioneSociale = ragioneSociale;
    this.gestore = gestore;
  }

public  String getNome()
{
  return ragioneSociale;
}
  public String toString(){
	  return id +"\t-\t"
   +ragioneSociale+"\t"+gestore+"\t"+super.toString();
  }
  public String toStringFollowerNumber(){
	  return id+"\t"+ragioneSociale+"\t"+seguaci.size();
  }
}
