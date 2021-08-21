import java.util.Random;
import java.util.Scanner;

class game{
    int number;
    int choice;
    int attempt=0;
    Scanner sc = new Scanner(System.in);
    Random r=new Random();
    game(){
        number=1+r.nextInt(100);
    }
    public void getInput(){
        
        System.out.print("Enter a Number between 1 - 100 : ");
        choice=sc.nextInt();
        attempt++;
        Check();
    }
    public void Check(){
        if(choice==number)
        {
            System.out.println("You found the Number : "+choice+" !!!");
            System.out.println("No of attempts : "+attempt);
            return;
        }
        else if(choice>number)
        {
            System.out.println("The Number is smaller than "+choice);
            getInput();
        }
        else
        {
            System.out.println("The Number is greater than "+choice);
            getInput();
        }
    }
}

public class ch_43_number_game {
    public static void main(String[] args) {
        game g = new game();
        g.getInput(); 
    }
}
