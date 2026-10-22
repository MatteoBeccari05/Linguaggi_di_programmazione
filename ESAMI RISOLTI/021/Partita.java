import java.sql.SQLWarning;

public class Partita {

private int avversario;
private int vinti,vinti_avv;

public Partita(int avversario,int vinti,int vinti_avv){
	this.avversario = avversario;
	this.vinti=vinti;
	this.vinti_avv=vinti_avv;
}

public boolean vinta()
{
	return vinti>vinti_avv;
}

public String toString(){
  return avversario+":"+vinti+"-"+vinti_avv;
  }
}
