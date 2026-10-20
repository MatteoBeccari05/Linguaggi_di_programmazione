public class Main 
{
    public static void main(String[] args) 
    {
        NaturalNumber<Integer> num1 = new NaturalNumber<>(42);
        NaturalNumber<Integer> num2 = new NaturalNumber<>(17);

        System.out.println("Il numero " + num1.getValue() + " è pari? " + num1.isEven());
        System.out.println("Il numero " + num2.getValue() + " è pari? " + num2.isEven());
        
        // NaturalNumber<Double> numErr = new NaturalNumber<>(3.14); // Errore di compilazione!
    }
}

/*
Mostra che specificando un limite con extends (<T Integer extends>), 
non solo restringiamo i tipi accettati dalla classe, ma permettiamo al 
compilatore di sapere che l'oggetto n possiede tutti i metodi della classe Integer 
(come intValue()), che possiamo quindi invocare in sicurezza per verificare se il numero è pari.   
*/