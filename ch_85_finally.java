public class ch_85_finally {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println("Division : " + a / b);
        } catch (Exception e) {
            System.out.println("EXCEPTION : " + e);
        } finally {
            System.out.println("I am Finally");
        }

        try {
            System.out.println(50 / 3);
        } finally {
            System.out.println("Yes this is also finally");
        }
    }
}
/*
 * 
 * FINALLY : finally is used to runn some statements which should be executed in
 * a program, even if any exception has occured in the program.
 * 
 * finally will run even if the method is returned or loop breaks, before it
 * goes to finally
 * 
 * 
 * 
 * 
 */