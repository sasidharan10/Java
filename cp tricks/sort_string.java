import java.util.*;

public class sort_string {
    public static void main(String[] args) {
        String str = "banana";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);
        System.out.println("After sorting: " + str);
    }
}
