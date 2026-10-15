public class Converter
{   
    private int numero;
    
    public Converter(String[] args) throws IllegalArgumentException, ArrayIndexOutOfBoundsException 
    {
        //controllo se l'array è vuoto
        if (args.length == 0) 
        {
            throw new ArrayIndexOutOfBoundsException("Nessun parametro inserito da riga di comando");
        }

        //controllo se il parametro è un numero intero
        numero = Integer.parseInt(args[0]);

        //controllo se il numero è compreso tra -10 e 10
        if (numero < -10 || numero > 10) 
        {
            throw new IllegalArgumentException("Errore: il numero " + numero + " è fuori dall'intervallo [-10, 10]");
        }

        System.out.println("Numero convertito: " + getNumero());
    }

    public int getNumero() 
    {
        return numero;
    }
}