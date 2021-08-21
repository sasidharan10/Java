import java.util.Scanner;

public class ch_05_input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int a = sc.nextInt();
        System.out.println("Integer : " + a);
        System.out.println("Enter a Float : ");
        float f = sc.nextFloat();
        System.out.println("Float : " + f);
        System.out.println("Enter a Word : ");
        String c = sc.next();
        System.out.println("Word : " + c);
        System.out.println("Enter an Double : ");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("Double : " + d);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("String : " + str);
        System.out.println("Enter something (check if input is integer) : ");
        boolean b=sc.hasNextInt();
        System.out.println(b);
        sc.close();
    }
}
