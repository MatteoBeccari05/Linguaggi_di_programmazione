public class FuoriCasa extends Partita
{
  private String citta;
  
  public FuoriCasa(String c, String d, String o, String r, int v)
  {
	super(d,o,r,v);
    this.citta=c;
  }
  
  public String toString(){
	  return "-\t" + citta + "\t" + data + "\t" + ora + "\t" + risultato;
  }
  
  public String getCitta(){
		return this.citta;
	}
}