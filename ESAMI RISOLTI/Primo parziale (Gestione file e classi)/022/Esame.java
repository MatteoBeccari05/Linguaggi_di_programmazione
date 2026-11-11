

public  class Esame {
	
	protected int codice;
	protected String voto;	
	
	public Esame(int c, String v){
        codice=c;
		voto = v;
	}
  public int getVotoAsInt()
 {
     if (voto.equals("30L"))
        return 31;
    else
        return Integer.parseInt(voto);
	}		
	public String getVotoAsString()
	{
		return voto;
	}
	public int getCorso()
	{
		return codice;
	}
	public String toString(){
		return "("+codice+","+voto+")";
	}
}