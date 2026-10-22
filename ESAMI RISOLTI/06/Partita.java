public class Partita
{
  protected String data;
  protected String ora;
  protected String risultato;
  protected int vinta;
  
  public Partita(String d, String o, String r, int v)
  {
    data=d;
    ora=o;
    risultato=r;
    vinta=v;
  }
  
  public int getVinta(){
		return this.vinta;
	}
  /*public String getProduttore(){
		return this.produttore;
	}
  public String getModello(){
		return this.modello;
	}
	*/
}