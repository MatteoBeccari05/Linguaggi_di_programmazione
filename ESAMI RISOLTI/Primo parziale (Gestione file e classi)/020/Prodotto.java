import java.sql.SQLWarning;

public class Prodotto {

private String desc;
private float prezzo;
private float costo;
private String tipo;

public Prodotto(String desc,String tipo, float prezzo, float costo){
	this.desc = desc;
	this.tipo=tipo;
	this.prezzo=prezzo;
	this.costo=costo;
}

public float getPrezzo()
{
	return prezzo;
}

public String toString(){
  return desc+": "+prezzo+"-"+costo;
  }
}
