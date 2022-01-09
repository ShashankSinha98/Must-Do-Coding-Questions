import java.util.*;
public class RecursivelyRmoveAllAdjacentDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(remove2("abaa"));
	}
	
	static String remove(String s) {
       
		Stack<Character> st = new Stack<>();
		
		if(s.isEmpty()) return s;
		
		st.add(s.charAt(0));
		
		char top = st.peek();
		int i=1;
		
		while(i<s.length()) {
			
			if(s.charAt(i)==top) {
				st.pop();
				
				while(i<s.length() && s.charAt(i)==top) i++;
				top = st.peek();
				
				
			} else {
				st.add(s.charAt(i));
				i++;
				top = st.peek();
			}
			
			
		}
		
		String res = "";
		while(!st.isEmpty()) {
			char c = st.pop();
			res = c + res;
		}
		
		s = res;
		
		//System.out.println(st);
		return s;
    }
	
	static String remove2(String s) {
		
		String res = removeAdjDuplicates(s);
		String resres = removeAdjDuplicates(res);
		
		while(resres.length()!=res.length()) {
			res = resres;
			resres = removeAdjDuplicates(resres);
		}
		
		
		return resres;
		
	}
	
	private static String removeAdjDuplicates(String s) {
		
		if(s.length()==1) return s;
		
		int i=0;
		String res = "";
		
		while(i+1<s.length()) {
			if(s.charAt(i)!=s.charAt(i+1)) {
				res += s.charAt(i);
				i++;	
			} else {
				i++;
				while(i<s.length() && s.charAt(i-1)==s.charAt(i)) i++;
			}
		}
		
		if(i==s.length()-1 && s.charAt(i)!=s.charAt(i-1)) res+=s.charAt(i);
		
		return res;
		
	}

}
