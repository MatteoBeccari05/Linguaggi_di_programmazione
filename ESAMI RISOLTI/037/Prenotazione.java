

public  class Prenotazione {
	
	protected int codice_campo, ora;
	
	public Prenotazione(int codice_campo, int ora){
        this.codice_campo=codice_campo;
		this.ora = ora;
	}

	public String toString()
	{
		return "("+codice_campo+","+ora+")";
	}
}