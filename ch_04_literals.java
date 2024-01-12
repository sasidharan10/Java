public class ch_04_literals {
    public static void main(String[] args) {
        byte age = 34; // default int
        int age2 = 56;
        short age3 = 87;
        long ageDino = 5666666666666L; // include L
        char ch = 'A';
        float f1 = 5.6f; // have to include F for float literals
        double d1 = 4.66; // no need to use d as it is double by default
        boolean a = true;
        String str = "Harry";
        System.out.print("byte: " + age);
        System.out.printf("\nint: %d\n", age2);
        System.out.println("short: " + age3);
        System.out.println("long: " + ageDino);
        System.out.println("char: " + ch);
        System.out.println("float: " + f1);
        System.out.println("double: " + d1);
        System.out.println("String: " + str);
        System.out.println("boolean: " + a);
        System.out.println("\nWrapper Class used in Collection framework: ");
        Integer it = 56; // wrapper class
        Byte bt = 12;
        Short st = 23;
        Long lt = 34L;
        Character ct = 'D';
        Float ft = 3435.7878F;
        Double dt = 765.9678;
        Boolean bb = false;
        System.out.println("\nInteger: " + it);
        System.out.println("Byte: " + bt);
        System.out.println("Short: " + st);
        System.out.println("Long: " + lt);
        System.out.println("Character: " + ct);
        System.out.println("Float: " + ft);
        System.out.println("Double: " + dt);
        System.out.println("Boolean: " + bb);
    }
}
