import java.util.Scanner;

class squareException extends Exception {
    public String toString() {
        return "Dimensions Cannot be negative!!!";
    }
}

public class ch_84_throws {
    public static int perimeter(int s) throws squareException {
        if (s < 0)
            throw new squareException();
        return 4 * s;
    }

    public static void main(String[] args) {
        System.out.println("Enter Side of Square : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        try {
            int ans = perimeter(s);
            System.out.println("Perimeter : " + ans);
        } catch (Exception e) {
            System.out.println("EXCEPTION : ");
            System.out.println(e);
        }
        sc.close();
    }
}

/*
 * THROW : 'throw' keyword is used to throw exceptions explicitly whenever the
 * developer needs it.
 * 
 * THROWS : 'throws' is used to mention that a method will be throwing
 * exception, so the calling method should handle it with try and catch.
 * 
 */