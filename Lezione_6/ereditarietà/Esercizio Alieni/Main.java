public class Main 
{
    public static void main(String[] args) 
    {   
        Serpente s1 = new Serpente("Sirbiss",100);
        Orco o1 = new Orco("Shrek",100);
        Marshmallow m1 = new Marshmallow("Mork",100);
        
        Serpente s2 = new Serpente("Sirbiss2",100);
        Orco o2 = new Orco("Shrek2",100);
        Marshmallow m2 = new Marshmallow("Mork2",100);


        GruppoAlieni ga = new GruppoAlieni(6);
        ga.AddAlieno(s1, 0);
        ga.AddAlieno(o1, 1);
        ga.AddAlieno(m1, 2);
        ga.AddAlieno(s2, 3);
        ga.AddAlieno(o2, 4);
        ga.AddAlieno(m2, 5);
        System.out.println("Danno: "+ga.GetDannoTotale());
    }
}
