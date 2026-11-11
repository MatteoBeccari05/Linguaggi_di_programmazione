import java.util.*;

public class Lab extends Corso {
	
  private String lab,ass;
  private int post;
  
  public Lab(int c, String n, String d, String lab, String ass, int post)
  {
    super(c,n,d);
    this.lab = lab;
    this.ass=ass;
    this.post=post;
  }
    	public String toString(){
		return super.toString()+"lab.\t-\t-\t-\t"+lab+"\t"+ass+"\t"+post;
	}

}
