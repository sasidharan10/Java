public class ch_31_methods {
    static int logic(int x, int y){
        int z;
        if(x>y)
            z = x+y;
        else 
            z=y-x;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        // ch_31_methods obj = new ch_31_methods();
        // c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        System.out.println("difference: "+c);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println("difference: "+c1);
    }
}
// we can call non-static methods from static methods using objects