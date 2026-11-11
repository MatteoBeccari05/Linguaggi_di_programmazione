import java.util.*;

public class Libro extends Prodotto {
	
  private String isbn;
  
  public Libro(int id, String titolo, String autori, int prezzo, String isbn){
    super(id,titolo,autori,prezzo);
    this.isbn = isbn;
  }
  
  public String toString(){
	  return "libro" + "\t" + id + "\t" + titolo + "\t" + autori + "\t" + prezzo + "\t" + isbn + "\t-";
  }
}
