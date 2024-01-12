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
        Integer iy = 56;  // wrapper class
        System.out.println("Integer: " + iy);
    }
}
