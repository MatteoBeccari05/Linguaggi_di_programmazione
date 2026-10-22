import java.util.*;

public  class Iscritto {

	protected int id; //codice
	protected String indirizzo;
	protected String account;
	protected String password;
	protected List<Iscritto> seguaci;



	public Iscritto(int id, String indirizzo,  String account,  String password){
		this.id = id;
		this.indirizzo = indirizzo;
		this.account = account;
		this.password=password;
		seguaci = new LinkedList<Iscritto>();
	}
  public void aggiungiSeguace(Iscritto i)
  {
    seguaci.add(i);
  }

  public int getNumeroSeguaci()
	{
		return seguaci.size();
	}
	public  String getNome()
	{
		return "";
	};
public  int getId()
{
	return id;
};
  public String toString(){
	  return indirizzo + "\t" + account +"\t" + password.length();
  }
	public  String toStringFollowerNumber()
	{
		return "";
	};
}
