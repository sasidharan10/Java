import java.util.*;

public class ch_02_stack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        // Use push() to add elements into the Stack
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println(animals);

        // Fetching the element at the head of the Stack
        System.out.println(animals.peek());

        // Removing elements using pop() method
        animals.pop();
        System.out.println(animals);

        // check if stack is empty
        System.out.println(animals.isEmpty());

        // size
        System.out.println(animals.size());

        // addAll() will add full collection of same data type

        // search the element, return index, if element found
        System.out.println(animals.search("Dog"));
        System.out.println(animals.search("Monkey"));

        animals.push("Horse");
        animals.push("Cat");
        animals.push("Tiger");
        animals.push("Leopard");

        System.out.println("\nWays to Iterate Stack: ");
        
        System.out.println("\nUsing Iterator: ");
        Iterator<String> it = animals.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        // Pop elements from the stack
        System.out.println("\nUsing Loop: ");
        while (!animals.isEmpty()) {
            System.out.print(animals.pop() + ", ");
        }
    }
}
