import java.util.*;

public class Appello {
	
	protected int id; //codice
	protected String docente;
	protected String corso;
	protected int giorno;
	protected int mese;
	protected int anno;
	protected int ora;
	
	public Appello(int id, String docente, String corso, int giorno,
  int mese,int anno,int ora){
		this.id = id;
		this.docente = docente;
		this.corso = corso;
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
		this.ora = ora;
	}
	public int getOra()
  {  
    return ora;
  }
}
