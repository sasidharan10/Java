import java.util.*;

public class stringBuiler_in_java {
    public static void main(String[] args) {
        // String Concatenation:

        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        s1.append(" ");
        s1.append("World");
        String result = s1.toString();
        System.out.println(result); // Output: Hello World

        // String Append with Different Types:

        StringBuilder s2 = new StringBuilder();
        s2.append("The answer is: ").append(42).append(", ").append(3.14);
        result = s2.toString();
        System.out.println(result); // Output: The answer is: 42, 3.14

        // String Insertion:

        StringBuilder s3 = new StringBuilder("Java StringBuilder");
        s3.insert(5, "Awesome ");
        System.out.println(s3.toString()); // Output: Java Awesome StringBuilder

        // String Deletion:

        StringBuilder s4 = new StringBuilder("Java StringBuilder");
        s4.delete(5, 14);
        System.out.println(s4.toString()); // Output: Java Builder

        // Char Deletion:

        s4 = new StringBuilder("Java StringBuilder");
        s4.deleteCharAt(s4.length() - 1);
        s4.deleteCharAt(s4.length() - 1);
        System.out.println(s4.toString()); // Output: Java StringBuilde

        // String Replacement:

        StringBuilder s5 = new StringBuilder("Java StringBuilder");
        s5.replace(5, 14, "Util");
        System.out.println(s5.toString()); // Output: Java Util

        // String Reversal:

        StringBuilder s6 = new StringBuilder("Hello");
        s6.reverse();
        System.out.println(s6.toString()); // Output: olleH

        // Capacity Management:

        StringBuilder s7 = new StringBuilder(20); // Initial capacity set to 20
        s7.append("This is a long string that may require resizing");
        System.out.println(s7.toString()); // Output: This is a long string that may require resizing

        // Chaining Methods:

        StringBuilder s8 = new StringBuilder();
        s8.append("Hello").append(" ").append("World");
        System.out.println(s8.toString()); // Output: Hello World

    }
}

/*
 * Object References: When you pass a StringBuilder (or any other object) to a method, 
   the method receives a reference to the original object.
 */
