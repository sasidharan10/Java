import java.util.*;

public class sorting_2d_arr {

    public static void main(String[] args) {
        int[][] twoDArray = {
                { 4, 6, 2 },
                { 1, 5, 3 },
                { 9, 8, 7 }
        };

        Arrays.sort(twoDArray, (a, b) -> Integer.compare(a[0], b[0]));
        // Arrays.sort(twoDArray, (a, b) -> Integer.compare(b[0], a[0])); // for reverse
        for (int[] is : twoDArray) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }

        // 2D ArrayList:

        System.out.println("2D ArrayList");
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        ans.get(0).add(1);
        ans.get(0).add(3);
        ans.get(0).add(2);

        ans.get(1).add(6);
        ans.get(1).add(4);
        ans.get(1).add(5);

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        for (List<Integer> list : ans) {
            for (Integer it : list) {
                System.out.print(it + ", ");
            }
            System.out.println();
        }
    }

}
