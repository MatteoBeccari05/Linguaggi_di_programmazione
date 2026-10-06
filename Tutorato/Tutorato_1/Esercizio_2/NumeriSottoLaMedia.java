public class NumeriSottoLaMedia
{
    public static void main(String[] args) 
    {
        int temperature[];
        if (args.length==0)
        {
            System.out.println("Nessun argomento");
        } 
        else if(args.length == 5)
        {
            temperature = new int[5];
            for(int i = 0; i < temperature.length; i++)
            {
                temperature[i] = Integer.parseInt(args[i]);
            }

            System.out.println("Media Temperature: " + media(temperature));

            System.out.println("Temperature sotto la media: ");
            for(int i = 0; i < TemperatureSottoLaMedia(media(temperature), temperature).length; i++)
            {
                System.out.print(" " + TemperatureSottoLaMedia(media(temperature), temperature)[i]);
            }
        }  
        else
        {
            System.out.println("Numero argomenti errato");
        }
    }

    static double media(int temperature[])
    {
        double media = 0;
        for(int i = 0; i < temperature.length; i++)
        {
            media += temperature[i];
        }
        return media/temperature.length;
    }

    static int[] TemperatureSottoLaMedia(double media, int[] temperature)
    {
        int indice = 0;

        for(int i = 0; i < temperature.length; i++)
        {
            if(temperature[i] < media)
            {
                indice++;
            }
        }

        int[] temp_sotto_media = new int[indice];
        int j = 0;

        for(int i = 0; i < temperature.length; i++)
        {
            if(temperature[i] < media)
            {
                temp_sotto_media[j] = temperature[i];
                j++;
            }
        }
        return temp_sotto_media;
    }
}