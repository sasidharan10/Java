
public class immutable {

    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        // s2[0]="s";  since strings are immutable
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
    }
}