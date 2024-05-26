public class ReverseIteratively {

    public static ListNode reverseListIterative(ListNode head) {
        ListNode currNode = head;
        ListNode prev = null; 
        ListNode next = null; 

        while(currNode != null) {
            next = currNode.nextNode;
            currNode.nextNode = prev;
            prev = currNode;
            currNode = next;
        }

        return prev;
    }

    
}
