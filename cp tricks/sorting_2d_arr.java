import java.util.*;

public class sorting_2d_arr {

    public static void main(String[] args) {
        int[][] twoDArray = {
                { 4, 6, 2 },
                { 1, 5, 3 },
                { 9, 8, 7 }
        };

        Arrays.sort(twoDArray, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] is : twoDArray) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }
    }

}
