public class Main
{
    public static void main(String[] args) 
    {
        // Possibile cliente (Slide 15):
        MyStack<Integer> stack = new MyStack<Integer>();
        // Invocazione in cascata:
        stack.push(18).push(22).push(34);

        while (!stack.isEmpty()) 
        {
            System.out.println(stack.pop()); // Stampa: 34, 22, 18
        }
    }
    
}
