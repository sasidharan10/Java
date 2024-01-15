import java.util.*;

public class ch_14_collections {
    public static void main(String[] args) {
        ArrayList<Integer> lt = new ArrayList<>();
        lt.add(4);
        lt.add(1);
        lt.add(2);
        lt.add(6);
        lt.add(3);

        System.out.println("List: " + lt);

        // Sorting
        Collections.sort(lt);
        System.out.println("List (after sorting): " + lt);

        Collections.sort(lt, Comparator.reverseOrder());
        System.out.println("List (Descending Order): " + lt);

        // reverse
        Collections.reverse(lt);
        System.out.println("reverse(): " + lt);

        // Binary Search
        int index = Collections.binarySearch(lt, 3);
        System.out.println("binarySearch(3): " + index);

        // shuffle the array (random order)
        Collections.shuffle(lt);
        System.out.println("shuffle(): " + lt);

        // Max
        int maxi = Collections.max(lt);
        System.out.println("max(): " + maxi);

        // Mini
        int mini = Collections.min(lt);
        System.out.println("min(): " + mini);

        // Mini
        int freq = Collections.frequency(lt, 4);
        System.out.println("frequency(): " + freq);

        // addAll()
        Collections.addAll(lt, 8, 9);
        System.out.println("addAll(): " + lt);

        // Replaces all occurrences of one specified value with another.
        Collections.replaceAll(lt, 1, 5);
        System.out.println("replaceAll(): " + lt);

        // Copies all of the elements from one list into another.
        ArrayList<Integer> destination = new ArrayList<>();
        Collections.copy(destination, lt);
        System.out.println("copy(): " + destination);
    }
}
