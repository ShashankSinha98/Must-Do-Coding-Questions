
public class LongestPalindomicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "GEEKSFORGEEKS";
		String r = reverse(s);
		System.out.println(r);
		
		System.out.println("res: "+(LongestCommonSubsequence.lcs(s.length(), r.length(), s, r)));
	}
	
	static String reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}

}
