import java.util.*;

public class Pallavolo extends Squadra {
	
  private float media_setvinti;
  
  public Pallavolo(int c, String nome, int vinte, int perse, float media)
  {
    super(c,nome,vinte,perse);
    media_setvinti = media;
  }
    	public String toString(){
		return super.toString()+"\t-\t"+
      media_setvinti+"\tpallavolo";
	}

}
