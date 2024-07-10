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

    public static ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode current = head;
        while (current != null) {
            st.push(current);
            current = current.next;
        }
        int maxi = st.peek().val;
        ListNode resulthead = st.peek();
        ListNode newList = st.peek();
        st.pop();
        while (!st.isEmpty()) {
            if (st.peek().val >= maxi) {
                maxi = st.peek().val;
                ListNode temp = st.peek();
                temp.next = newList;
                newList = temp;
                resulthead = newList;
            }
            st.pop();
        }
        return resulthead;
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int minDiff = Integer.MAX_VALUE;
        int firstIndex = 0;
        int prevIndex = 0;
        int index = 2;
        while (curr != null) {
            if (curr.next != null) {
                if ((prev.val > curr.val && curr.next.val > curr.val)
                        || (prev.val < curr.val && curr.next.val < curr.val)) {
                    if (firstIndex == 0) {
                        firstIndex = index;
                    } else {
                        minDiff = Math.min(minDiff, index - prevIndex);
                    }
                    prevIndex = index;
                }
            }
            index++;
            prev = curr;
            curr = curr.next;
        }

        if (minDiff == Integer.MAX_VALUE)
            return new int[] { -1, -1 };
        return new int[] { minDiff, prevIndex - firstIndex };
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
        list1 = removeNodes(list1);
        printList(list1);
    }
}
