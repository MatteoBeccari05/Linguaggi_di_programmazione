import java.util.*;

public class Teoria extends Corso {
	
  private int aula,ore;
  private double oreLez;
  
  public Teoria(int c, String n, String d, int aula, int ore, double oreLez)
  {
    super(c,n,d);
    this.aula = aula;
    this.ore=ore;
    this.oreLez=oreLez;
  }
    	public String toString(){
		return super.toString()+"teoria\t"+
      aula+"\t"+ore+"\t"+oreLez +"\t-\t-\t-";
	}

}
