
import java.util.Stack;

public class ReverseDataStructure {
    public static ListNode reverseListDataStructure(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        ListNode currNode = head;
        while(currNode != null) {
            stack.push(currNode);
            currNode = currNode.nextNode;
        }

        ListNode dummy = new ListNode();
        currNode = dummy;
        while(!stack.isEmpty()) {
            currNode.nextNode = stack.pop();
            currNode = currNode.nextNode;
        }

        currNode.nextNode = null;

        return dummy.nextNode;
    }
}
