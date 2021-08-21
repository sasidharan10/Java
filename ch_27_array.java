public class ch_27_array {
    public static void main(String[] args) {
        int[] a = new int[3]; // declaration without initialisation
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i : a)
            System.out.print(i + " ");

        int[] b; // only variable declaration
        b = new int[3]; // object created (memory allocated)
        b[0] = 10;
        int[] c = { 1, 2, 3, 4, 5 };
        System.out.println("array : ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println("2D Array : ");
        int [][]d ={{1,2},{3,4}};
        for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[i].length; j++) { 
                    System.out.print(d[i][j]+" ");
                }
                System.out.println();
        }
    }
}
