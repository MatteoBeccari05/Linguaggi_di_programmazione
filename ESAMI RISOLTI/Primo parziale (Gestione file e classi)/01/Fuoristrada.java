public class Fuoristrada extends Auto
{
  private int marce;
  
  public Fuoristrada(String m, String pr, int marce, int p, int cod)
  {
	super(m,pr,p,cod);
    this.marce=marce;
  }
  
  public String toString(){
	  return codice + "\t" + produttore + "\t" + modello + "\t-\t" + marce;
  }
}