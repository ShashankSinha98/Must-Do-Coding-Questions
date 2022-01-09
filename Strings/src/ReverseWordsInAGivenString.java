import java.util.*;

public class ReverseWordsInAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new ReverseWordsInAGivenString().reverseWords("i.like.this.program.very.much"));
	}
	
	String reverseWords(String S)
    {
		S+='.';
		char[] sArr = S.toCharArray();
		
		int l=0, r=0;
		for(int i=1; i<S.length(); i++) {
			if(S.charAt(i)=='.') {
				r = i-1;
				reverse(sArr, l, r);
				l = i+1;
			}
		}
		
		//System.out.println(Arrays.toString(sArr));
		reverse(sArr, 0, sArr.length-1);
		S = new String(sArr);
		
		return S.substring(1);
		
    }
	
	private void reverse(char[] arr, int l, int r) {
		while(l<r) {
			char temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			l++;
			r--;
		}
	}

}
