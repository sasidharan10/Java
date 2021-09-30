public class fibo {
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
    static int fib(int n)
    {
        int a=0,b=1,c;
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            for (int i = 2; i <= n; i++) {
                c=a+b;
                a=b;
                b=c;
            }
            return (a);
        }
    }
}
