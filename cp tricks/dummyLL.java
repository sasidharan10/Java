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

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head = InsertEnd(head, 2);
        head = InsertEnd(head, 0);
        head = InsertEnd(head, -4);
        printList(head);
        head.next.next.next = head.next;
        System.out.print("Result: ");
        System.out.print(hasCycle(head));
    }
}
