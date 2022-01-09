
public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
	
	Node sortedMerge(Node head1, Node head2) {
	     
		Node dummy = new Node(-1);
		
		Node p=dummy, c1=head1, c2=head2;
		
		while(c1!=null && c2!=null) {
			if(c1.data<=c2.data) {
				p.next = c1;
				c1 = c1.next;
			} else {
				p.next = c2;
				c2 = c2.next;
			}
			p = p.next;
		}
		
		if(c1==null) p.next = c2;
		else if(c2==null) p.next = c1;
		
		return dummy.next;
	} 

}
