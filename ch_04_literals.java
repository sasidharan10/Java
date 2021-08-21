public class ch_04_literals {
    public static void main(String[] args) {
        byte age = 34;  // default int
        int age2 = 56;
        short age3 = 87;
        long ageDino = 5666666666666L;  // include L
        char ch = 'A';
        float f1 = 5.6f;  // have to include F for float literals
        double d1 = 4.66;  // no need to use d an it is double by default
        boolean a = true;
        String str = "Harry";
        System.out.print(age);
        System.out.printf("\n%d\n",age2);
        System.out.println(age3);
        System.out.println(ageDino);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(str);
        System.out.println(a);
    }
}
