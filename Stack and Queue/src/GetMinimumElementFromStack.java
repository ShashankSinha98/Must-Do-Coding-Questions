import java.util.*;

public class GetMinimumElementFromStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int minEle;
    Stack<Integer> s;

    private void init() {
    	if(s==null) {
    		s = new Stack<>();
    		minEle = Integer.MAX_VALUE;
    	}
    }
    
    int getMin()
    {
    	init();
    	return s.isEmpty() ? -1: minEle;
    }
    
    
    int pop()
    {
    	init();
    	if(s.isEmpty()) return -1;
    	else {
    		
    		if(minEle<=s.peek()) return s.pop();
    		else {
    			int ans = minEle;
    			int prevMin = 2*ans - s.pop();
    			minEle = prevMin;
    			return ans;
    		}
    	}
    }

   
    void push(int x)
    {
    	init();
    	if(s.isEmpty()) {
    		s.push(x);
    		minEle = x;
    	} else {
    		if(x>=minEle) s.push(x);
    		else {
    			s.push(2*x-minEle);
    			minEle = x;
    		}
    	}
    }

}
