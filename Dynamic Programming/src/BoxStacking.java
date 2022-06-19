import java.util.*;
public class BoxStacking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] h = new int[] {1,4,3};
		int[] w = new int[] {2,5,4};
		int[] l = new int[] {3,6,1};
		
		int ans = maxHeight(h, w, l, h.length);
		System.out.println(ans);
		

	}
	
	public static int maxHeight(int[] height, int[] width, int[] length, int n) {
		
		List<Box> boxes = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int l = length[i];
			int w = width[i];
			int h = height[i];
			
			boxes.add(new Box(Math.min(w, h), Math.max(w, h), l));
			boxes.add(new Box(Math.min(l, h), Math.max(l, h), w));
			boxes.add(new Box(Math.min(w, l), Math.max(w, l), h));
		}
		
		Comparator<Box> boxComparator = (b1, b2) ->  - (b1.l*b1.w) + (b2.l*b2.w);
		Collections.sort(boxes, boxComparator);
		//boxes.stream().forEach(b-> System.out.println(b));
		
		n = boxes.size();
		int[] T = new int[n];
		T[0] = boxes.get(0).h;
		int maxH = 0;
		
		for(int i=1; i<n; i++) {
			Box topBox = boxes.get(i);
			for(int j=0; j<i; j++) {
				Box bottomBox = boxes.get(j);	
				if(topBox.l < bottomBox.l && topBox.w < bottomBox.w) {
					T[i] = Math.max(T[i], T[j]);
				}
			}
			T[i] += topBox.h;
			maxH = Math.max(maxH, T[i]);
		}
		
		//System.out.println(Arrays.toString(T));
		
		return maxH;
    }

}

class Box {
	int l, w, h;
	
	public Box(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(l: "+l+", w: "+w+", h: "+h+")";
	}
}
