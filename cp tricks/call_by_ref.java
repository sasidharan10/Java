import java.util.*;

public class call_by_ref {
    public static int b;

    public static void func1(int a) {
        a = 5678;
    }

    public static void func2(String temp) {
        temp = "xavi";
    }

    public static void func3(List<Integer> ls) {
        ls.add(100);
    }

    public static void main(String[] args) {
        int a = 10;
        // We cannot achieve "Call by reference" in java, as its not possible."
        // We can use global variables as an alternative approach.
        // Or create a class, and use that variable as an object.
        func1(a);
        System.out.println("A: " + a);

        String str1 = "messi";
        func2(str1);
        System.out.println("Str 1: " + str1);

        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        func3(ls);
        System.out.println("List: " + ls);

    }
}
