import java.util.*;

public class Individuo extends Iscritto {

  private String nome;


public Individuo(int id, String indirizzo,  String account,  String password,
String nome){
  super(id,indirizzo,account,password);
  this.nome = nome;
}
public  String getNome()
{
  return nome;
}

  public String toString(){
	  return id +"\t"+nome+"\t-\t-\t"+super.toString();
  }
  public String toStringFollowerNumber(){
	  return id +"\t"+nome+"\t"+seguaci.size();
  }
}
