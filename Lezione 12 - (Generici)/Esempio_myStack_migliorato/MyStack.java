import java.util.List;
import java.util.ArrayList;

public class MyStack<T> {
    private List<T> storage;

    public MyStack() { 
        storage = new ArrayList<T>(); 
    }

    public MyStack<T> push(T elem) {
        storage.add(elem); 
        return this; // CASCADING
    }

    public T pop() { 
        return storage.remove(storage.size() - 1); 
    }

    public boolean isEmpty() { 
        return storage.isEmpty(); 
    }
}

