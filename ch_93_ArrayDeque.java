import java.util.ArrayDeque;

public class ch_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Character> dq = new ArrayDeque<>();
        dq.add('a');
        dq.add('b');
        dq.add('c');
        dq.addFirst('o');
        dq.addLast('d');
        dq.removeFirst();
        dq.remove('d');
        for (Character c : dq) {
            System.out.print(c+" ");
        }
        System.out.println("\nll.size() : " + dq.size());
        System.out.println("dq.contains('a') : " + dq.contains('a'));
        System.out.println("dq.contains('z') : " + dq.contains('z'));
        System.out.println("dq.isEmpty() : " + dq.isEmpty());
        dq.clear();
    }
}
