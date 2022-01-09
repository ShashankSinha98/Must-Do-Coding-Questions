
public class Givenalinkedlistof0s1sand2ssortit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static Node segregate(Node head)
    {
        Node zero = new Node(-1);
        Node one = new Node(-1);
        Node two = new Node(-1);
        
        Node p0=zero, p1=one, p2=two;
        Node curr = head;
        
        while(curr!=null) {
        	
        	if(curr.data==0) {
        		p0.next = curr;
        		p0 = p0.next;
        	} else if(curr.data==1) {
        		p1.next = curr;
        		p1 = p1.next;
        	} else {
        		p2.next = curr;
        		p2 = p2.next;
        	}
        	curr = curr.next;
        }
        
        p0.next = (one.next!=null)?one.next: two.next;
        p1.next = two.next;
        p2.next = null;
        
        head = p0.next;
        return head;
        
        
    }

}
