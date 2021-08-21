import java.util.Scanner;

public class ch_82_nested_try {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Exception in level 1");
        }
        System.out.println("Thanks for using this program");
        sc.close();
    }
}
