import java.util.*;

public abstract class Corso {
	
	protected int codice;
	protected String nome, docente;
	
	
	public Corso(int c, String n, String d){
    codice=c;
		nome = n;
		docente = d;
		}

	public String toString(){
		return nome+"\t"+codice+"\t"+docente+"\t";
	}
}