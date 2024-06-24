import java.util.*;

public class sortClass {

    public static class Pair {
        int first;
        int second;

        Pair() {
        }

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void sortPair() {
        List<Pair> mp = new ArrayList<>();
        mp.add(new Pair(1, 3));
        mp.add(new Pair(7, 3));
        mp.add(new Pair(3, 3));
        mp.add(new Pair(9, 3));
        mp.add(new Pair(5, 3));
        System.out.println("List: ");
        for (Pair p : mp) {
            System.out.println(p.first + " : " + p.second);
        }

        Comparator cmp = new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                return Integer.compare(p1.first, p2.first);
            }
        };
        
        // Collections.sort(mp, cmp); // using comparator interface
        Collections.sort(mp, (a, b) -> Integer.compare(a.first, b.first)); // short hand form

        // // Expanded version
        // Collections.sort(mp, (a, b) -> {
        //     if (a.first < b.first)
        //         return -1;
        //     else if (a.first > b.first)
        //         return 1;
        //     else
        //         return 0;
        // });

        System.out.println("List: ");
        for (Pair p : mp) {
            System.out.println(p.first + " : " + p.second);
        }

    }

    public static void main(String[] args) {
        sortPair();
    }
}
