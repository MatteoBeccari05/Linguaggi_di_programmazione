import java.util.*;

public class Tennis extends Campo {
	
  private float temperatura;
  private String terreno;
  
  public Tennis(int c, String n, float larghezza, float lunghezza, float temperatura, float costo, String terreno)
  {
    super(c,n,larghezza,lunghezza,costo);
		this.temperatura = temperatura;
		this.terreno = terreno;
  }
 	public String toString(){
		return "tennis\t"+super.toString()+temperatura+"\t"+terreno+"\t-\t-\t"+costo;
}

}
