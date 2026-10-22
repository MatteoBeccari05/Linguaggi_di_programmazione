import java.util.*;

public class TestaDiSerie extends Giocatore {
	
  private int ranking;
  private int eta;
  private boolean prof;
  
  public TestaDiSerie(int c, String nome, int ranking, int eta, boolean prof)
  {
    super(c,nome);
    this.eta = eta;
    this.ranking=ranking;
    this.prof=prof;
  }
    	public String toString(){
		return super.toString()+"testa-di-serie\t"+ranking+"\t"+eta+"\t"+prof+"\t-\t-\t-";
	}

}
