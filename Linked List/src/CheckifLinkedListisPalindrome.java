
public class CheckifLinkedListisPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	boolean isPalindrome(Node head) 
    {
        //Your code here
        Node middle = getMiddle(head);
        Node tail = reverseList(middle);
        
        Node curr = head;
        while(tail!=null) {
        
            if(curr.data!=tail.data) return false;
            tail = tail.next;
            curr = curr.next;
            
        }
        
        return true;
    } 
    
     Node reverseList(Node head)
    {
        if(head.next==null) return head;
        
        Node a = head;
        Node b = null;
        
        while(a!=null) {
        	Node temp = a.next;
        	a.next = b;
        	b = a;
        	a = temp;
        }
        
        return b;
    }
    
    
    Node getMiddle(Node head)
    {
         Node fast = head;
         Node slow = head;
         
         while(fast.next!=null && fast.next.next!=null) {
             fast = fast.next.next;
             slow = slow.next;
         }
         
         if(fast.next!=null) slow = slow.next;
         
         return slow;
    }

}
