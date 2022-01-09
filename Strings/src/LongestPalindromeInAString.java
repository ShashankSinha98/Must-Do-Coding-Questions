
public class LongestPalindromeInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(longestPalin("aaaabbaa"));
	}
	
	static String longestPalin(String S){
       
		String longestPallindromeFound = ""+S.charAt(0);
		int longestPallindromeLen = 1;
		
		// Look for odd Palindrome
		int i=0;
		while(i+2<S.length()) {
			if(S.charAt(i)==S.charAt(i+2)) {
				String res = explore(S, i, i+2);
				if(res.length()>longestPallindromeLen) {longestPallindromeFound = res; longestPallindromeLen = res.length();}
			}
			i++;
		}
		
		// Look for even Palindrome
		i = 0;
		while(i+1<S.length()) {
			if(S.charAt(i)==S.charAt(i+1)) {
				String res = explore(S, i, i+1);
				if(res.length()>longestPallindromeLen) {longestPallindromeFound = res; longestPallindromeLen = res.length(); }
			}
			i++;
		}
        
		return longestPallindromeFound;
    }
	
	
	private static String explore(String S, int l, int r) {
		
		String res = S.substring(l,r+1);
		l--; r++;
		
		while(l>=0 && r<S.length() && S.charAt(l)==S.charAt(r)) {
			
			res = S.charAt(l) + res + S.charAt(r);
			l--; r++;
		}
		
		return res;
	}
	
	

}
