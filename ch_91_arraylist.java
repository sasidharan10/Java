import java.util.ArrayList;

public class ch_91_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<Integer> bi = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.remove(0); // remove at index 4
        // bi list
        bi.add(10);
        bi.add(10);
        bi.add(10);
        li.addAll(0, bi); // at 0 index
        li.remove(1);     // removes index 1 element
        for (Integer i : li) {
            System.out.print(i + " ");
        }
        bi.clear();
        System.out.println("\nbi.isEmpty() : " + bi.isEmpty());
        System.out.println("li.size() : " + li.size());
        System.out.println("li.contains(100) : " + li.contains(100));
        System.out.println("li.indexOf(10) : " + li.indexOf(10)); // lowerbound
        System.out.println("li.indexOf(200) : " + li.indexOf(200));
        System.out.println("li.lastIndexOf(10) : " + li.lastIndexOf(10)); // upperbound
        System.out.println("li.isEmpty() : " + li.isEmpty());
        li.clear(); // clears the list
    }
}
