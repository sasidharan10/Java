import java.util.HashSet;
import java.util.Iterator;

public class ch_95_hashset {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(3);
        s.add(3);  // removes duplicate
        s.add(4);
        s.remove(1);  // element 1 gets removed
        Iterator<Integer> i = s.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        System.out.println("\nll.size() : " + s.size());
        System.out.println("s.contains(2) : " + s.contains(2));
        System.out.println("s.contains(200) : " + s.contains(200));
        System.out.println("s.isEmpty() : " + s.isEmpty());
        s.clear();
    }
}
