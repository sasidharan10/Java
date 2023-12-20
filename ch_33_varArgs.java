public class ch_33_varArgs {
    static int add(int... arr) {
        int result = 0;
        for (int a : arr) {
            result = result + a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(1, 2));
        System.out.println(add(2, 3, 4));
        System.out.println(add(4, 5, 6));
    }
};

/*
 * You can pass any number of arguments of the specified type when calling the method. 
   The arguments are treated as an array within the method.

 */
