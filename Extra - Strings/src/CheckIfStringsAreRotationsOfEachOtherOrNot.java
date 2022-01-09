import java.util.Arrays;

public class CheckIfStringsAreRotationsOfEachOtherOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println(Arrays.toString(getPrefixSuffixArray("abcabcd".toCharArray())));
		
		System.out.println(areRotations("mightandmagic", "andmagicmigth"));
	}
	
	 public static boolean areRotations(String s1, String s2 ) {
	 
		 if(s1.length()!=s2.length()) return false;
		 
		 String S = s1+s1;
		 
		int[] lps = getPrefixSuffixArray(s2.toCharArray());
		
		int i=0, j=0;
		
		while(i<S.length() && j<s2.length()) {
			
			if(S.charAt(i)==s2.charAt(j)) {i++; j++;}
			else {
				if(j!=0) j = lps[j-1];
				else i++;
			}
		}
		
		if(j==s2.length()) return true;
		
		 
		 return false;
	 }
	 
	 
	 private static int[] getPrefixSuffixArray(char[] s) {
		 
		 int[] lps = new int[s.length];
		 
		 int j=0, i=1;
		 
		 while(i<s.length) {
			 
			 if(s[i]==s[j]) {
				 lps[i] = j+1;
				 j++;
				 i++;
			 } else {
				 if(j!=0) j = lps[j-1];
				 else {
					 lps[i++] = 0;
				 }
			 }
			 
		 }
		 
		 return lps;
	 }

}
