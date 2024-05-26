public class ReverseRecursively {
    public static ListNode reverseListRecursion(ListNode head) {
        if (head.nextNode == null) {
            return head;
        }

        ListNode reverse = reverseListRecursion(head.nextNode);
        head.nextNode.nextNode = head;
        head.nextNode = null;

        return reverse;
    }
}
