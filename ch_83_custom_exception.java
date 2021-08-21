import java.util.Scanner;

class myException extends Exception {
    public String toString() {
        return "Dimensions cannot be negative!!!";
    }
}

public class ch_83_custom_exception {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square : ");
        a = sc.nextInt();
        sc.close();
        if (a < 0) {
            try {
                throw new myException();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else
            System.out.println("Area : " + (a * a));
    }
}
