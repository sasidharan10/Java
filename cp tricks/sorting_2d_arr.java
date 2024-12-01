import java.util.*;

public class sorting_2d_arr {

    public static void main(String[] args) {
        int[][] twoDArray = {
                { 4, 6, 2 },
                { 1, 5, 3 },
                { 9, 8, 7 }
        };
        System.out.println("2D array: ");
        // To sort elements in each row
        // for (int i = 0; i < twoDArray.length; i++) {
        //     Arrays.sort(twoDArray[i]);
        // }

        // To sort the rows based of itss first element.
        Arrays.sort(twoDArray, (a, b) -> Integer.compare(a[0], b[0]));
        // Arrays.sort(twoDArray, (a, b) -> Integer.compare(b[0], a[0])); // for reverse
        for (int[] is : twoDArray) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }

        // List of array

        List<int[]> lt = new ArrayList<>();
        lt.add(new int[] { 9, 7 });
        lt.add(new int[] { 5, 2 });
        lt.add(new int[] { 3, 3 });
        lt.add(new int[] { 1, 1 });
        lt.add(new int[] { 6, 9 });
        lt.add(new int[] { 4, 4 });
        lt.add(new int[] { 2, 0 });

        Collections.sort(lt, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                // return Integer.compare(a[0], b[0]); // ascending
                // return Integer.compare(b[0], a[0]); // decending
                return Integer.compare(a[1], b[1]); // ascending, but sorts based on 2nd
                // element.
            }
        });
        System.out.println("List of array: ");
        for (int[] it : lt) {
            System.out.println(it[0] + " : " + it[1]);
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
