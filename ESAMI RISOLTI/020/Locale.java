import java.util.*;

public abstract class Locale {
	
	protected int codice;
	protected String nome;
	protected List<Prodotto> menu;
	
	
	public Locale(int c, String n){
    codice=c;
		nome = n;
    menu   = new LinkedList<Prodotto>();
	}
  public void addProdotto(Prodotto p)
 {
		menu.add(p);	
	}		
  public String getNome()
 {
		return nome;	
	}	
  public int getCodice()
 {
		return codice;	
	}		
	public List<Prodotto> getMenu()
 {
		return menu;	
	}	
		public float getMedia()
 {
	  int n=menu.size();
		float tot=0;
		for (Prodotto p:menu)
		  tot=tot+p.getPrezzo();
		return tot/n;
	}	
	public String toString(){
		return nome+"\t"+codice+"\t";
	}
}