import java.util.*;

public class Pallacanestro extends Squadra {
	
  private double media_falli;
  private int punti_tot;
  
  public Pallacanestro(int c, String nome, int vinte, int perse, int punti_tot, 
  double media_falli)
  {
    super(c, nome,vinte,perse);
    this.punti_tot = punti_tot;
    this.media_falli=media_falli;
  }
    	public String toString(){
		return super.toString()+"\t"+
      punti_tot+"\t"+media_falli+"\t-\tpallacanestro";
}

}
