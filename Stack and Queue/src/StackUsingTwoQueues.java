import java.util.*;

public class StackUsingTwoQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Queues
	{
	    Queue<Integer> q1 = new LinkedList<Integer>();
	    Queue<Integer> q2 = new LinkedList<Integer>();
	    
	    //Function to push an element into stack using two queues.
	    void push(int a)
	    {
		    while(!q1.isEmpty()) {
		    	q2.add(q1.poll());
		    }
		    
		    q1.add(a);
		    
		    while(!q2.isEmpty()) {
		    	q1.add(q2.poll());
		    }
		    
	    }
	    
	     
	    int pop()
	    {
		    return q1.isEmpty()? -1: q1.poll();
	    }
		
	}

}
