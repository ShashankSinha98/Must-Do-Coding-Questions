
public class BinaryHeapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinHeap mh = new MinHeap(10);
		mh.insertKey(8);
		mh.insertKey(9);
		mh.deleteKey(1);
		int ans = mh.extractMin();
		System.out.println(ans);
		ans = mh.extractMin();
		System.out.println(ans);
		
	}
	
	
	private static class MinHeap {
	    int[] harr;
	    int capacity, heap_size;
	    MinHeap(int cap) {
	        heap_size = 0;
	        capacity = cap;
	        harr = new int[cap];
	    }
	    int parent(int i) { return (i - 1) / 2; }
	    int left(int i) { return (2 * i + 1); }
	    int right(int i) { return (2 * i + 2); }

	    //Function to extract minimum value in heap and then to store 
	    //next minimum value at first index.
	    int extractMin()
	    {
	    	if(this.heap_size==0) return -1;
	        int min = this.harr[0];
	        deleteKey(0);
	        return min;
	    }

	    //Function to insert a value in Heap.
	    void insertKey(int k) 
	    {
	        decreaseKey(this.heap_size++, k);
	    }

	    //Function to delete a key at ith index.
	    void deleteKey(int i) 
	    {
	    	if(this.heap_size==0 || i>=this.heap_size) return;
	    	
	    	if(this.heap_size==1 && i==0) this.harr[this.heap_size--] = 0;
	    	
	    	else if(i==heap_size-1) {
	        	this.harr[this.heap_size--] = 0;
	        } else {
	        	int lastItem = this.harr[this.heap_size-1];
	        	this.harr[this.heap_size--] = 0;
	        	this.harr[i] = lastItem;
	        	decreaseKey(i,lastItem);
	        	MinHeapify(i);
	        }
	    }

	    //Function to change value at ith index and store that value at first index.
	    void decreaseKey(int i, int new_val) 
	    {
	        harr[i] = new_val;
	        while (i != 0 && harr[parent(i)] > harr[i]) {
	            int temp = harr[i];
	            harr[i] = harr[parent(i)];
	            harr[parent(i)] = temp;
	            i = parent(i);
	        }
	    }

	    /* You may call below MinHeapify function in
	      above codes. Please do not delete this code
	      if you are not writing your own MinHeapify */
	    void MinHeapify(int i) {
	        int l = left(i);
	        int r = right(i);
	        int smallest = i;
	        if (l < heap_size && harr[l] < harr[i]) smallest = l;
	        if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
	        if (smallest != i) {
	            int temp = harr[i];
	            harr[i] = harr[smallest];
	            harr[smallest] = temp;
	            MinHeapify(smallest);
	        }
	    }
	}

}
