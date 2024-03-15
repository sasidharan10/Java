import java.util.HashMap;

public class dummyLL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode InsertEnd(ListNode head, int n) {
        ListNode temp1 = new ListNode(n);
        if (head == null) {
            head = temp1;
            return head;
        }
        ListNode temp2 = head;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = temp1;
        return head;
    }

    public static void printList(ListNode head) {
        System.out.print("List: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int prefixSum = 0;
        HashMap<Integer, ListNode> mp = new HashMap<>();
        mp.put(0, dummy);
        while (head != null) {
            prefixSum += head.val;
            if (mp.containsKey(prefixSum)) {
                ListNode start = mp.get(prefixSum);
                ListNode temp = start;
                int pSum = prefixSum;

                temp = temp.next;
                while (temp != head) {
                    pSum += temp.val;
                    mp.remove(pSum);
                    temp = temp.next;
                }
                start.next = temp.next;
            } else {
                mp.put(prefixSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(8);
        head = InsertEnd(head, 2);
        head = InsertEnd(head, -3);
        head = InsertEnd(head, 3);
        head = InsertEnd(head, 1);
        printList(head);
        System.out.print("Result: ");
        head = removeZeroSumSublists(head);
        printList(head);
    }
}
