import java.util.*;

public class Hockey extends Squadra {
	
  private double media_gol, media_falli;
  
  public Hockey(int c, String nome, int vinte, int perse, float media, 
  double media_falli)
  {
    super(c, nome,vinte,perse);
    media_gol = media;
    this.media_falli=media_falli;
  }
    	public String toString(){
		return super.toString()+"\t"+
      media_gol+"\t"+media_falli+"\t-\thockey";
}

}
