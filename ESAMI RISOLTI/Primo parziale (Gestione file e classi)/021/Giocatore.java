import java.util.*;

public abstract class Giocatore {
	
	protected int codice;
	protected String nome;
	protected List<Partita> partite;
	
	
	public Giocatore(int c, String n){
    codice=c;
		nome = n;
    partite   = new LinkedList<Partita>();
	}
  public void addPartita(Partita p)
 {
		partite.add(p);	
	}		
  public String getNome()
 {
		return nome;	
	}	
  public int getCodice()
 {
		return codice;	
	}		
	public List<Partita> getPartite()
 {
		return partite;	
	}	
		public int getVinte()
 {
		int tot=0;
		for (Partita p:partite)
		  if (p.vinta())
			  tot=tot+1;
		return tot;
	}	
	public String toString(){
		return nome+"\t"+codice+"\t";
	}
}