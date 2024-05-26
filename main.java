
// import com.sun.source.tree.NewClassTree;
// import java.util.Stack;

public class main {

    public static void main(String[] args) {
        // creating list 
        int[] vals = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(1);
        ListNode currNode = head;
        for (int i = 1; i < vals.length; i++) {
            currNode.nextNode = new ListNode(vals[i]);
            currNode = currNode.nextNode;
        }
        printLinkedList(head);
        
        System.out.println("");

        // ListNode reversedNode1 = ReverseIteratively.reverseListIterative(head);
        // printLinkedList(reversedNode1);

        // ListNode reversedNode2 = ReverseDataStructure.reverseListDataStructure(head);
        // printLinkedList(reversedNode2);

        // System.out.println("");

        ListNode reversedNode3 = ReverseRecursively.reverseListRecursion(head);
        printLinkedList(reversedNode3);

    }
    

    public static void printLinkedList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.nextNode;
        }
    }
}