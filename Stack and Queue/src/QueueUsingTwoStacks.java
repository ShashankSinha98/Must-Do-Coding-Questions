import java.util.*;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class StackQueue
	{
	    Stack<Integer> s1 = new Stack<Integer>();
	    //Stack<Integer> s2 = new Stack<Integer>();

	    //Function to push an element in queue by using 2 stacks.
	    void Push(int x)
	    {
		   s1.push(x);
	    }
		
	    
	    //Function to pop an element from queue by using 2 stacks.
	    int Pop()
	    {
		   return dequeue(s1);
	    }
	    
	    int dequeue(Stack<Integer> st) {
	    	
	    	if(st.isEmpty()) return -1;
	    	
	    	if(st.size()==1) return st.pop();
	    	
	    	int top = st.pop();
	    	
	    	int res = dequeue(st);
	    	
	    	st.add(top);
	    	
	    	return res;
	    }
	    
	}

}
