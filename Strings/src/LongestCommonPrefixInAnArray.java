import java.util.Arrays;

public class LongestCommonPrefixInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ans = longestCommonPrefix(new String[]{"hello","world"}, 2);
		
		System.out.println(ans);
	}
	
	static String longestCommonPrefix(String arr[], int n){
        
		Arrays.sort(arr);
		
		String a = arr[0];
		String b = arr[n-1];
		
		int l = (a.length()<b.length()) ? a.length() : b.length();
		
		String res = "";
		for(int i=0; i<l; i++) {
			if(a.charAt(i)==b.charAt(i)) res += a.charAt(i);
			else break;
		}
		
		return res.isEmpty()?"-1":res;
		
    }

}
