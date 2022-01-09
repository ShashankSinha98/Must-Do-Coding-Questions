import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(nextLargerElement(
				new long[] {6, 8, 0, 1, 3}, 5)));
	}
	
	
    public static long[] nextLargerElement(long[] arr, int n)
    { 
    	long[] ans = new long[n];
    	for(int i=0; i<n; i++) ans[i] = -1;
    	
    	Stack<Integer> st = new Stack<>();
    	st.add(0);
    	
    	for(int i=1; i<n; i++) {
    		if(arr[i]<arr[st.peek()]) {
    			st.add(i);
    		
    		} else {
    			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
    				int p = st.pop();
    				ans[p] = arr[i];
    			}
    			
    			st.add(i);
    		}
    	}
    	
    	return ans;
    } 

}
