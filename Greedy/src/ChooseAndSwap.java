import java.util.*;
class ChooseAndSwap {
	
	public static void main(String... args) {
		
		String A = "acb";
		String ans = chooseandswap2(A);
		System.out.println("Ans: "+ans);
	}
	
	private static String chooseandswap(String A){
		
		if(A==null || A.length()==0) return A;
		
		int n = A.length();
		int[] T = new int[26];
		Arrays.fill(T, -1);
		
		for(int i=0; i<n; i++) {
			char c = A.charAt(i);
			int idx = c-'a';
			if(T[idx]==-1) T[idx] = i;
		}
		
		//System.out.println(Arrays.toString(T));
		
		int i=0;
		while(i<n) {
			char c = A.charAt(i);
			int idx = c-'a';
			int val = T[idx];
			char smaller = '\0';
			for(int j=idx-1; j>=0; j--) {
				if(T[j]>val) smaller = (char)(j+'a');
			}
			
			if(smaller != '\0') {
				char first = smaller;
				char second = A.charAt(i);
				
				StringBuilder sb = new StringBuilder();
				for(int k=0; k<n; k++) {
					if(A.charAt(k)==first) sb.append(second);
					else if(A.charAt(k)==second) sb.append(first);
					else sb.append(A.charAt(k));
				}
				
				return sb.toString();
			} else {
				i++;
			}
		}
		
		return A;
		
	}
	
	private static String chooseandswap2(String A) {
		
		int n = A.length();
		int[] T = new int[26];
		Arrays.fill(T, -1);
		
		for(int i=0; i<n; i++) {	
			if(T[A.charAt(i)-'a']==-1) 
				T[A.charAt(i)-'a'] = i; 
		}
		
		char first='\0', second='\0';
		for(int i=0; i<n; i++) {
			
			if(first!='\0') break;
			
			for(int j=0; j<A.charAt(i)-'a'; j++) {
				if(T[j]>T[A.charAt(i)-'a']) {
					first = A.charAt(T[j]);
					second = A.charAt(i);
					break;
				}
			}
		}
		
		if(first=='\0') return A;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			if(A.charAt(i)==first) sb.append(second);
			else if(A.charAt(i)==second) sb.append(first);
			else sb.append(A.charAt(i));
		}
		
		return sb.toString();
	}
}