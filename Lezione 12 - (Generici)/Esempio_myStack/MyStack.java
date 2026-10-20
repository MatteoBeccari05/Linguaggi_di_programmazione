import java.util.List;
import java.util.ArrayList;

public class MyStack<T> 
{
    private List<T> storage;

    // Osserva: nel costruttore non si mette <T>
    public MyStack() { 
        storage = new ArrayList<T>(); 
    }

    public void push(T elem) { 
        storage.add(elem); 
    }

    public T pop() { 
        return storage.remove(storage.size() - 1); 
    }

    public boolean isEmpty() { 
        return storage.isEmpty(); 
    }
}