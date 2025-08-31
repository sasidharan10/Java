import java.util.*;

public class ch_01_arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);

        // ArrayList with capacity
        al.add(1);
        al.add(2);
        al.add(3);

        // add 100 at index 1
        al.add(1, 100);
        System.out.println(al);

        // Add whole collection (needs to be of same data type)
        temp.add(20);
        al.addAll(temp);
        al.addAll(q);
        System.out.println(al);

        // access element at index 0
        System.out.println(al.get(0));
        System.out.println(al.get(1));

        // sort
        Collections.sort(al);
        System.out.println(al);

        // reverse order sort
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println(al);

        // Size
        System.out.println(al.size());

        // remove
        al.remove(1);
        System.out.println(al);

        al.add(3);
        al.add(4);
        al.add(76);

        // removeif
        al.removeIf((a) -> a > 50);
        System.out.println(al);

        // declaration with size
        // ArrayList<Integer> bl = new ArrayList<>(5);

        // assigning values while declaring
        ArrayList<Integer> bl = new ArrayList<>(Collections.nCopies(5, 1));

        // fill using collection (only works when )
        Collections.fill(bl, 100);
        System.out.println(bl);

        // clear
        bl.clear();

        // is empty
        System.out.println(bl.isEmpty());

        // Checks equality of 2 ArrayList
        System.out.println(al.equals(bl));

        // checks if a element is present in ArrayList
        System.out.println(al.contains(1));

        // checks whether all elements in collection bl is present in al
        System.out.println(al.containsAll(bl));

        // Object[] arr = al.toArray();  // to convert it to array

        // returns into string
        System.out.println(al.toString());

        System.out.println("\nWays to Iterate ArrayList: ");
        System.out.println("\nUsing Loop: ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + ", ");
        }

        System.out.println("\nUsing ForEach: ");
        for (int var : al) {
            System.out.print(var + ", ");
        }

        System.out.println("\nUsing Iterator: ");
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }

        // ArrayList's Foreach:
        System.out.print("\n\nForEach: ");
        al.forEach((a) -> {
            System.out.print(a + ", ");
        });
    }
}
