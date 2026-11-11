import java.util.*;

public class Normale extends Giocatore {
	
  private int partite_giocate;
  private int set;
  private String circolo;
  
  public Normale(int c, String nome, int partite, int set,String circolo)
  {
    super(c,nome);
    this.partite_giocate = partite;
    this.set = set;
    this.circolo=circolo;
  }
    	public String toString(){
		return super.toString()+"normale\t-\t-\t-\t"+
      circolo+"\t"+set+"\t"+partite_giocate;
	}

}
