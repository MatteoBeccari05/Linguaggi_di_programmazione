public class Giocatore {

private String cognome;
private int eta;
private int maglia;
private String ruolo;
private boolean titolare;

public Giocatore(String c, int e, int num, String r, boolean t){
	cognome = c;
	eta = e;
	maglia = num;
	ruolo = r;
	titolare = t;
}


public String toString(){
  return cognome+"\t"+eta+"\t"+maglia+"\t"+ruolo+"\t"+titolare;}
}
