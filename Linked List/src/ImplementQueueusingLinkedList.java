
public class ImplementQueueusingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 Node front, rear;
	    
	    //Function to push an element into the queue.
		void push(int a)
		{
	        // Your code here
	        if(front==null && rear==null) {
	            front = new Node(a);
	            rear = front;
	        } else {
	            front.next = new Node(a);
	            front = front.next;
	        }
		}
		
	    //Function to pop front element from the queue.
		int pop()
		{
	        // Your code here
	        if(rear==null) return -1;
	        if(front==rear) {
	            int res = front.data;
	            front = null;
	            rear = null;
	            return res;
	        }
	        else {
	             int res = rear.data;
	             rear = rear.next;
	             return res;
	        }
	        
		}

}
