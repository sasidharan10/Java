import java.util.*;

public class ch_13_arrays_methods {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] temp = new int[5];
        temp[0] = 4;
        temp[1] = 2;
        temp[2] = 3;
        temp[3] = 5;
        temp[4] = 1;

        // fill
        Arrays.fill(arr, 1);
        System.out.println("Arr: " + Arrays.toString(arr));

        // Assigns the specified value in the specified range of the array.
        Arrays.fill(arr, 1, 3, 5);
        System.out.println("Arr: " + Arrays.toString(arr));

        // sort()
        // sort(T[] a, int fromIndex, int toIndex)
        // Comparator wont work for primitive array
        Arrays.sort(arr);
        System.out.println("sort(): " + Arrays.toString(arr));

        // Binary Search
        // binarySearch(T[] a, int fromIndex, int toIndex, T key)
        int index = Arrays.binarySearch(arr, 3);
        System.out.println("binarySearch(3): " + index);

        // equals()
        boolean isEqual = Arrays.equals(arr, temp);
        System.out.println("Arrays are equal: " + isEqual);

        // asList
        String[] colors = { "Red", "Green", "Blue" };
        List<String> colorList = Arrays.asList(colors);
        System.out.println(colorList); // Output: [Red, Green, Blue]

        // Returns a string representation of the contents of the specified array.
        String arrayString = Arrays.toString(arr);
        System.out.println(arrayString);

    }
}
