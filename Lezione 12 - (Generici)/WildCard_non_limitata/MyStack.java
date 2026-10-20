import java.util.*;

class MyStack<T> 
{
    private List<T> storage = new ArrayList<T>();
    public MyStack<T> push(T elem) { storage.add(elem); return this; }
    public T pop() { return storage.remove(storage.size() - 1); }
    public boolean isEmpty() { return storage.isEmpty(); }
}

