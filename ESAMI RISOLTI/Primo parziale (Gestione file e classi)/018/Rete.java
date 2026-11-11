import java.io.*;
import java.util.*;

public class Rete {

  public static void main(String[] args) {
    List<Iscritto> iscritti = new LinkedList<Iscritto>();
    Map<Integer,Iscritto> id_to_is = new HashMap<Integer,Iscritto>();

       Map<Integer,Integer> seguaci = new HashMap<Integer,Integer>();

        //PUNTO 1: memorizzazione prodotti
        try {
            BufferedReader br = new BufferedReader(new FileReader("iscritti.txt"));
            String line=br.readLine(); //prima riga: tipo+codice
            while (line!= null){
            	//lettura di 1 appello
                String nome;
                String indirizzo;
                String ragioneSociale;
                String account,password;
                int codice;
            	StringTokenizer tokenizer = new StringTokenizer(line);
                String type         = tokenizer.nextToken();
                int id              = Integer.parseInt(tokenizer.nextToken());
                if (type.equals("individuo"))
                {
                nome		= br.readLine();
                indirizzo       = br.readLine();
                tokenizer = new StringTokenizer(br.readLine());
                account=tokenizer.nextToken();
                password=tokenizer.nextToken();
                Iscritto i = new Individuo(id, indirizzo, account,password,nome);
                iscritti.add(i);
                id_to_is.put(id,i);

                } else {
                ragioneSociale=br.readLine();
                indirizzo       = br.readLine();
                nome       = br.readLine();
                tokenizer = new StringTokenizer(br.readLine());
                account=tokenizer.nextToken();
                password=tokenizer.nextToken();
                Iscritto i = new Azienda(id,indirizzo, account,password,ragioneSociale,nome);
                iscritti.add(i);
                id_to_is.put(id,i);
                }
                      line = br.readLine();
                      line = br.readLine();
            }//while
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        catch (Exception e) {
			System.err.println(e);
        }
  		//PUNTO 2
              try {
                  BufferedReader br = new BufferedReader(new FileReader("segue.txt"));
                  String line=br.readLine(); //prima riga: tipo+codice
                  while (line!= null){
                  	//lettura di 1 appello
                      int codice=Integer.parseInt(line);
                      Iscritto i= id_to_is.get(codice);

                      line=br.readLine();
                  	StringTokenizer tokenizer = new StringTokenizer(line);
                    while(tokenizer.hasMoreTokens())
                    {
                      int id              = Integer.parseInt(tokenizer.nextToken());
                      Iscritto seguace=id_to_is.get(id);
                      i.aggiungiSeguace(seguace);
                  }
                            line = br.readLine();
                  }//while
                  br.close();
              } catch (IOException e) {
                  System.err.println(e);
              }
              catch (Exception e) {
      			System.err.println(e);
              }
    // punto 3
		System.out.println("ID\tNome/Cognome\tRagioneSociale\tNomeCognomeGestoreAccount\tIndirizzo\tNomeAccount\t"+
    "LunghezzaPassword");
  		for (Iscritto i: iscritti)
  			System.out.println(i);
        
  			System.out.println();

    // punto 4
    System.out.println("ID\tNome/Cognome/RagioneSociale\tNumeroSeguaci");
    for (Iscritto i: iscritti)
    {
      System.out.println(i.getId()+"\t"+i.getNome()+"\t"+i.getNumeroSeguaci());
    }

        //PUNTO 5
        int cod=-1,maxSeguaci=-1;
        String nome="";
    for (Iscritto i: iscritti)
      if (i.getNumeroSeguaci()>maxSeguaci)
      {
        cod=i.getId();
        nome=i.getNome();
        maxSeguaci=i.getNumeroSeguaci();

      }
      System.out.println("\nIscritto con max seguaci: "+cod+"\t"+nome);
    }//main
}//class
