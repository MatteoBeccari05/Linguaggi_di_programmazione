import java.util.List;
import java.util.ArrayList;

class MyStack<T> 
{
    private List<T> storage;

    public MyStack() 
    { 
        storage = new ArrayList<T>(); 
    }

    public MyStack<T> push(T elem) 
    { 
        storage.add(elem); 
        return this; 
    }

    public T pop() 
    { 
        return storage.remove(storage.size() - 1); 
    }

    public boolean isEmpty() 
    { 
        return storage.isEmpty(); 
    }

    // Versione flessibile con tipo parametrico limitato (<E extends T>)
    public <E extends T> void moveFrom(MyStack<E> source) 
    {
        while (!source.isEmpty()) 
        {
            push(source.pop());
        }
    }

    // Permette a System.out.println(stack) di stampare il contenuto della lista
    @Override
    public String toString() 
    {
        return storage.toString();
    }
}