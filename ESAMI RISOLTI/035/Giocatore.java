import java.sql.SQLWarning;

public class Giocatore {

private String cognome, nome;
private int eta;
private int maglia;
private String ruolo;
private boolean titolare;
private Squadra squadra;

public Giocatore(String c, String n, int e, int num, String r, boolean t,Squadra squadra){
	cognome = c;
	nome = n;
	eta = e;
	maglia = num;
	ruolo = r;
	titolare = t;
	this.squadra=squadra;
}
 public String getNome()
 {
		return nome;	
	}

public String toString(){
  return nome+"\t"+cognome+"\t"+eta+"\t"+maglia+"\t"+ruolo+"\t"+titolare+"\t"+squadra.getNome();}
}
