import java.util.*;

public class Squadra {
	
	protected int codice;
	protected String nome;
	protected int vinte;
	protected int perse;
	protected List<Giocatore> giocatori;
	
	
	public Squadra(int c, String n, int v, int p){
    codice=c;
		nome = n;
		vinte = v;
		perse = p;
    giocatori   = new LinkedList<Giocatore>();
	}
  public void addGiocatore(Giocatore g)
 {
		giocatori.add(g);	
	}		
  public int nGiocatori()
 {
		return giocatori.size();	
	}		

  public int getCodice()
 {
		return codice;	
	}		
  public List<Giocatore> getGiocatori()
 {
		return giocatori;	
	}		
  public String getNome()
 {
		return nome;	
	}		
		
  public double getVinte()
	{
		return vinte;
	};

    	public String toString(){
		return nome + "\t"+ codice +"\t"+vinte+"\t"+perse;
}
}