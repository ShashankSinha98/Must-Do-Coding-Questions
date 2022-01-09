
public class LongestDistinctCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(longestSubstrDitinctChars("aaa"));
	}
	
	static int longestSubstrDitinctChars(String S){
       
		int[] mem = new int[26];
		int[] loc = new int[26];
		
		int i=0, j=0;
		
		int n = S.length();
		int count = 0;
		int maxLen = Integer.MIN_VALUE;
		
		while(i<n && j<n) {
			
			if(mem[S.charAt(j)-'a']==0) {
				count++;
				if(count>maxLen) maxLen = count;
				mem[S.charAt(j)-'a']++;
				loc[S.charAt(j)-'a'] = j;
				j++;
			} else {
				int t = loc[S.charAt(j)-'a'];
				while(i<=t) {
					count--;
					mem[S.charAt(i)-'a']--;
					i++;
				}
			}
		}
        return maxLen;
    }

}
