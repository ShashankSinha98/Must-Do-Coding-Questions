import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RearrangeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "kkk";
		String res = rearrangeCharacters(s);
		System.out.println("Res: "+res);
	}
	
	public static String rearrangeCharacters(String str) {
		PriorityQueue<C> pq = new PriorityQueue<>(new CustomComparator());
		
		int[] T = new int[26];
		for(char c: str.toCharArray()) {
			T[c-'a']++;
		}
		
		for(int i=0; i<26; i++) {
			
			if(T[i]>Math.ceil((str.length()*1.0)/2)) return "-1";
			
			if(T[i]>0) {
				char ch = (char)(i+97);
				C c = new C(ch, T[i]);
				pq.add(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		C temp = null;
		while(pq.size()!=0) {
			C c = pq.poll();
			sb.append(c.ch);
			c.count--;
			
			if(temp!=null) {
				pq.add(temp);
				temp = null;
			}
			
			if(c.count!=0)
				temp = c;
			else 
				temp = null;
		}
		
		return sb.toString();
	}
	
	
}

class C {
	char ch;
	int count;
	
	public C(char ch, int count) {
		this.ch = ch;
		this.count = count;
	} 
	
	@Override
	public String toString() {
		return "ch: "+this.ch+", c: "+this.count;
	}
}



class CustomComparator implements Comparator<C> {

	@Override
	public int compare(C c1, C c2) {
		if(c1.count > c2.count) return -1;
		else if(c1.count < c2.count) return 1;
		else {
			return (c1.ch > c2.ch)?1:-1;
		}
	}
	
}