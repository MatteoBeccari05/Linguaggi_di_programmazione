import java.util.*;

public class Campo {
	
	protected int codice;
	protected String nome;
	protected float larghezza, lunghezza, costo;
	protected int prenotazioni;
	
	public Campo(int c, String n, float larghezza, float lunghezza,  float costo)
	{
    	codice=c;
		nome = n;
		this.larghezza = larghezza;
		this.lunghezza = lunghezza;
		this.costo = costo;
    	prenotazioni = 0;
	}
  public void addPrenotazione()
  {
	prenotazioni++;	
  }		
  public float incasso()
  {
	return prenotazioni*costo;
  }
 

	public String toString(){
		return nome + "\t"+ codice +"\t"+larghezza+"\t"+lunghezza+"\t";
}
}