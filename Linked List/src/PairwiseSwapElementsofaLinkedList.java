
public class PairwiseSwapElementsofaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node pairwiseSwap(Node head)
    {
		if(head==null) return null;
		if(head.next==null) return head;
		
        Node prev = head;
        Node curr = head.next;
        
        curr.next = prev;
        
        head.next = pairwiseSwap(curr.next);
        
        return curr;
        
    }

}
