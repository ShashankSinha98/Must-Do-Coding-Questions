import java.util.*;
public class FindMedianInAStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static PriorityQueue<Integer> minHeap, maxHeap;
	
	static {
		minHeap = new PriorityQueue<>();
		maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	}
	
	 
    public static void insertHeap(int x) {
        if(maxHeap.size()==0 || x<=maxHeap.peek())
        	maxHeap.add(x);
        else 
        	minHeap.add(x);
        
        balanceHeaps();
    }
    
    
    public static void balanceHeaps() {
    	int maxSize = maxHeap.size();
    	int minSize = minHeap.size();
    	
    	if(Math.abs(maxSize-minSize)<=1) return;
    	
    	if(maxSize > minSize) {
    		int t = maxHeap.poll();
    		minHeap.add(t);
    	} else {
    		int t = minHeap.poll();
    		maxHeap.add(t);
    	}
    }
    

    public static double getMedian() {
    	int maxSize = maxHeap.size();
    	int minSize = minHeap.size();
    	
    	if(maxSize==minSize)
    		return ((maxHeap.peek()+minHeap.peek()) * 1.0)/2;
    	else if(maxSize>minSize)
    		return maxHeap.peek();
    	else return minHeap.peek();
    }

}

