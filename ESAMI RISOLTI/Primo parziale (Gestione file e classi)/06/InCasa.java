public class InCasa extends Partita
{
  private String palazzetto;
  
  public InCasa(String pal, String d, String o, String r, int v)
  {
    super(d,o,r,v);
    palazzetto=pal;
  }
  public String toString(){
	  return palazzetto + "\t-\t" + data + "\t" + ora + "\t" + risultato;
  }
}