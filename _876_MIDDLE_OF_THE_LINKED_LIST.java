public class _876_MIDDLE_OF_THE_LINKED_LIST {
    public class ListNode {
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

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i = head;
        ListNode j = head;
        int size = 1;

        while (i.next != null) {
            i = i.next;
            size++;
            if (size > n + 1) {
                j = j.next;
            }
        }
        if (n == size)
            return head.next;
        j.next = j.next.next;
        System.out.println();
        return head;

    }

    public static void main(String[] args) {

    }
}
