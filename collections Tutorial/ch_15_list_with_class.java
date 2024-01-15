import java.util.*;

public class ch_15_list_with_class {
    public static void main(String[] args) {
        ArrayList<emp> lt = new ArrayList<>();

        lt.add(new emp("Alex", 3));
        lt.add(new emp("Clark", 5));
        lt.add(new emp("Clark", 1));
        lt.add(new emp("Dave", 2));
        lt.add(new emp("Edgar", 1));

        System.out.println(lt);

        System.out.println("After Sorting: ");
        Collections.sort(lt, (a, b) -> a.empNo - b.empNo);

        System.out.println(lt);
    }

}