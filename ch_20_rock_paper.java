import java.util.Random;
import java.util.Scanner;

public class ch_20_rock_paper {
    public static void main(String[] args) {
        Random r = new Random();
        int ch = 1;
        Scanner sc = new Scanner(System.in);
        while (ch == 1) {
            System.out.println("------------------");
            System.out.println("Rock,Paper,Scissor");
            System.out.println("------------------");
            System.out.println("Select Options : ");
            System.out.println("1) Rock");
            System.out.println("2) Paper");
            System.out.println("3) Scissor");
            System.out.print("Your choice : ");

            int player = sc.nextInt();
            int computer = 1 + r.nextInt(3);
            System.out.println("Computer choice : " + computer);
            if (player == computer) {
                System.out.println("Game Draw!!! : ");
            } else if (player == 1 && computer == 2 || player == 2 && computer == 3 || player == 1 && computer == 3)
                System.out.println("Computer Wins!!!");
            else
                System.out.println("You Win!!!");

            System.out.println("Wanna play again!!!");
            System.out.println("1) Yes");
            System.out.println("2) No");
            ch = sc.nextInt();
        }
        sc.close();
    }

}
