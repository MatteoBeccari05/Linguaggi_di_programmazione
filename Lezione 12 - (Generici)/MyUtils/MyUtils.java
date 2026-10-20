import java.util.*;

class MyUtils 
{
    // Legge da una collezione di "almeno T" (? extends T)
    // Scrive in una collezione di "al più T" (? super T)
    public static <T> void copy(Collection<? extends T> src, Collection<? super T> dest) 
    {
        for (T elem : src) 
        {
            dest.add(elem);
        }
    }
}