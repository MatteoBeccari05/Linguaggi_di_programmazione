import java.util.*;

public class Basket extends Squadra {
	
  private float media_punteggi;
  
  public Basket(int c, String nome, int vinte, int perse, float media)
  {
    super(c, nome,vinte,perse);
    media_punteggi = media;
  }
    	public String toString(){
		return super.toString()+"\t"+
      media_punteggi+"\t-\tbasket";
}
}
