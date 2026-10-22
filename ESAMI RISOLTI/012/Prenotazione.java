public class Prenotazione {

private String nome;
private String cognome;
private int posto;
private boolean dipendente;

public Prenotazione(String n, String c, int p, boolean d){
	nome = n;
	cognome = c;
	posto = p;
	dipendente = d;
}


public String toString(){
  return nome + "\t" + cognome + "\t" + posto + "\t" + dipendente;}
}
