public class java_math {
    public static void main(String[] args) {
        int i = -7;
        double x = 28;
        double y = 4;
        double z = 9.678;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        System.out.println("Minimum number of x and y is: " + Math.min(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        // returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        System.out.println("abs(i) is: " + Math.abs(i));

        System.out.println("round(z) is: " + Math.round(z));

        System.out.println("The ceiling of " + z + " is: " + Math.ceil(z));

        System.out.println("The floor of " + z + " is: " + Math.floor(z));

        System.out.println("Pi is: " + Math.PI);
        System.out.println("e is: " + Math.E);

        // return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));

        System.out.println("log10 of x is: " + Math.log10(x));

        // return a power of 2
        System.out.println("exp of a is: " + Math.exp(x));
    }
}
