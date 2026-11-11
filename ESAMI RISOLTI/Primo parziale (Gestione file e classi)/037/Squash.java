import java.util.*;

public class Squash extends Campo {
	
  private float altezza;
  private int piano;
  
  public Squash(int c, String n, float larghezza, float lunghezza, float altezza, float costo, int piano)
  {
    super(c,n,larghezza,lunghezza,costo);
		this.altezza = altezza;
		this.piano = piano;
  }
  public String toString(){
		return "squash\t"+super.toString()+"-\t-\t"+
      altezza+"\t" +piano+"\t"+costo;
	}

}
