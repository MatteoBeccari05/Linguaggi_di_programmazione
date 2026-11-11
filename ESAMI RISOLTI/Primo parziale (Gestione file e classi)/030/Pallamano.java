import java.util.*;

public class Pallamano extends Squadra {
	
  private double media_reti;
  
  public Pallamano(int c, String nome, int vinte, int perse, double media)
  {
    super(c,nome,vinte,perse);
    media_reti = media;
  }
    	public String toString(){
		return super.toString()+"\t-\t-\t"+
      media_reti+"\tpallamano";
	}

}
