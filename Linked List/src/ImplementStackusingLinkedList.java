
public class ImplementStackusingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	class MyStack 
	{
	    Node top;
	    
	    //Function to push an integer into the stack.
	    void push(int a) 
	    {
	    	Node n = new Node(a);
	        if(top==null) top=n;
	        else {
	            n.next = top;
	            top = n;
	        }
	    }
	    
	    //Function to remove an item from top of the stack.
	    int pop() 
	    {
	        if(top==null) return -1;
	        else {
	            int res = top.data;
	            top = top.next;
	            return res;
	        }
	    }
	}

}
