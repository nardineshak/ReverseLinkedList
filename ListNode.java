
public class ListNode {
    ListNode nextNode;
    int val; 

    public ListNode() {
        this.nextNode = null;
        this.val = Integer.MIN_VALUE;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode nextNode, int val) {
        this.nextNode = nextNode;
        this.val = val;
    }
    
}