
import java.io.*;
import java.util.*;

public class Studente {

	private int mat;
	private String nome;
	protected List<Esame> libretto;

public Studente(int mat, String nome){
	this.mat = mat;
	this.nome=nome;
	this.libretto= new LinkedList<Esame>();
}
public int getMat()
{
	return mat;
}
public String getNome()
{
	return nome;
}
public Esame votoMax()
{
	int max=0;
	Esame maxe=null;
	for (Esame e:libretto)
		if (e.getVotoAsInt()>max)
		{
			max=e.getVotoAsInt();
			maxe=e;
		}
	return maxe;
}
public void addEsame(Esame e)
{
	libretto.add(e);
}
private double getMedia()
{
	double tot=0;
	for (Esame e : libretto)
		tot=tot+e.getVotoAsInt();
	return tot/libretto.size();

}
public String toString(){
  return nome+"\t"+getMedia()+"\t"+libretto;
  }
}
