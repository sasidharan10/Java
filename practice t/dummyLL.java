import java.util.*;

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

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;
        ListNode first = head;
        ListNode second = head.next;
        while (second != null) {
            int temp = findGCD(first.val, second.val);
            ListNode middle = new ListNode(temp);
            first.next = middle;
            middle.next = second;
            first = second;
            second = second.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(5);
        list1 = InsertEnd(list1, 2);
        list1 = InsertEnd(list1, 13);
        list1 = InsertEnd(list1, 3);
        list1 = InsertEnd(list1, 8);

        // ListNode list2 = new ListNode(1000000);
        // list2 = InsertEnd(list2, 1000001);
        // list2 = InsertEnd(list2, 1000002);
        // list2 = InsertEnd(list2, 1000003);
        // list2 = InsertEnd(list2, 1000004);
        int a = 2, b = 5;
        printList(list1);
        // list1 = reverseList(list1);
        System.out.print("Result: ");
        // list1 = removeNodes(list1);
        printList(list1);
    }
}
