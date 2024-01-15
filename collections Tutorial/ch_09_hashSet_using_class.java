import java.util.*;

public class ch_09_hashSet_using_class {
    public static void main(String[] args) {
        // Student st =  new Student("sasi", 10);
        // System.out.println(st);

        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("Alex", 3));
        hs.add(new Student("Clark", 5));
        hs.add(new Student("Clark", 1));
        hs.add(new Student("Dave", 2));
        hs.add(new Student("Edgar", 1));

        System.out.println(hs);
    }
}
