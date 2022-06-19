import java.util.*;
public class PageFaultsInLRU {

	public static void main(String[] args) {
		int N=9, C=4;
		int[] pages = new int[] {5, 0, 1, 3, 2, 4, 1, 0, 5};
		
		int pageFaults = pageFaults(N, C, pages);
		System.out.println("Ans: "+pageFaults);

	}
	
	static int pageFaults(int N, int C, int pages[]){
		
		int pageFaults = 0;
		ArrayList<Integer> LRU = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int ai = pages[i];
			
			if(!LRU.contains(ai)) {
				if(LRU.size() < C) {
					LRU.add(ai);
				} else {
					LRU.remove(0);
					LRU.add(ai);
				}
				pageFaults++;
			} else {
				LRU.remove(new Integer(ai));
				LRU.add(ai);
			}
		}
		
		return pageFaults;
    }

}
