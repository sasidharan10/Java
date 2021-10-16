import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]!=0)
            {
                sum+=arr[i];
                count++;
            }
        }
        double avg=sum/count;
        System.out.println(avg);
        sc.close();
    }
}
