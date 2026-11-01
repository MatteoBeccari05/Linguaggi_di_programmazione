import java.util.*;
import java.io.*;

public class Gestione 
{
    public static void main(String[] args) 
    {
        List<Partecipante> partecipanti = new ArrayList<>();
        List<Conferenza> conferenze = new ArrayList<>();
        Map<Integer, Partecipante> codPart = new HashMap<>();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("partecipanti.txt"));
            String line = br.readLine();
            
            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String nome = br.readLine();
                String cognome = br.readLine();
                if(tipo.equals("studente"))
                {
                    String nome_corso = br.readLine();
                    String nome_universita = br.readLine();
                    int anno_corso = Integer.parseInt(br.readLine());
                    Studente s = new Studente(codice, nome, cognome, tipo, nome_corso, nome_universita, anno_corso);
                    partecipanti.add(s);
                    codPart.put(codice, s);
                }
                else
                {
                    String ente = br.readLine();
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int numDip = Integer.parseInt(tok.nextToken());
                    boolean accademico = Boolean.parseBoolean(tok.nextToken());
                    Regolare r = new Regolare(codice, nome, cognome, tipo, ente, numDip, accademico);
                    partecipanti.add(r);
                    codPart.put(codice, r);
                }
                line = br.readLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


        for(Partecipante p : partecipanti)
        {
            System.out.println(p);
        }


        try
        {
            BufferedReader br = new BufferedReader(new FileReader("conferenze.txt"));
            String line = br.readLine();

            while(line != null)
            {
                String nome = line;
                String luogo = br.readLine();
                Conferenza c = new Conferenza(nome, luogo);
                conferenze.add(c);
                line = br.readLine();
                while(line != null && !line.equals(""))
                {
                    StringTokenizer tok = new StringTokenizer(line);
                    int codice_partecipante = Integer.parseInt(tok.nextToken());
                    int costo = Integer.parseInt(tok.nextToken());
                    Partecipazione p = new Partecipazione(codPart.get(codice_partecipante), costo);
                    c.addPartecipazione(p);
                    line = br.readLine();
                }
                line = br.readLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        for(Conferenza c : conferenze)
        {
            System.out.println(c);
        }

        System.out.println("Inserire codice: ");
        Scanner s = new Scanner(System.in);
        int codice_t= Integer.parseInt(s.nextLine());
        Partecipante p = codPart.get(codice_t);
        if(p.getTipo().equals("regolare"))
        {
            Regolare rt = (Regolare)p;
            System.out.println("Regolare, ente: " + rt.getEnte());
        }
        else
        {
            Studente st = (Studente)p;
            System.out.println("Studente, università: " + st.getUni());
        }
    }
}
