import java.util.*;

public class Osteria extends Locale {
	
  private int posti;
  private double sup;
  private boolean bagno;
  
  public Osteria(int c, String nome, int posti, double sup, boolean bagno)
  {
    super(c,nome);
    this.posti = posti;
    this.sup=sup;
    this.bagno=bagno;
  }
    	public String toString(){
		return super.toString()+"osteria\t-\t-\t"+
      posti+"\t"+sup+"\t"+bagno;
	}

}
