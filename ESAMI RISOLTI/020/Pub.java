import java.util.*;

public class Pub extends Locale {
	
  private int dip;
  private int tavoli;
  
  public Pub(int c, String nome, int dip, int tavoli)
  {
    super(c,nome);
    this.dip = dip;
    this.tavoli=tavoli;
  }
    	public String toString(){
		return super.toString()+"pub\t"+dip+"\t"+tavoli+"-\t-\t-";
	}

}
