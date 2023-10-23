import java.util.Scanner;

public class ch_07_marks {
    public static void main(String[] args) {
        float x = 7 / 4 * 9 / 2;
        System.out.println(x);
        System.out.println("Enter Maths Marks : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter Physics Marks : ");
        int p = sc.nextInt();
        System.out.println("Enter Chemistry Marks : ");
        int c = sc.nextInt();
        System.out.println("Enter CS Marks : ");
        int s = sc.nextInt();
        System.out.println("Enter English Marks : ");
        int e = sc.nextInt();
        System.out.println("Total percentage is : " + (float)((m + p + c + s + e) / 50) * 100 + " %");
        sc.close();
    }
}
