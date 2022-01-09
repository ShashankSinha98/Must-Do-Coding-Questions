
public class NonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nonrepeatingCharacter("aa"));
	}
	
	static char nonrepeatingCharacter(String S)
    {
        int[] countArr = new int[26];
        
        for(int i=0; i<countArr.length; i++) countArr[i] = -1;
        
        for(int i=0; i<S.length(); i++) {
        	if(countArr[S.charAt(i)-'a']==-1) countArr[S.charAt(i)-'a'] = i;
        	else if(countArr[S.charAt(i)-'a'] >=0 ) countArr[S.charAt(i)-'a'] = -2;
        }
        
        int minIdxFound = Integer.MAX_VALUE;
        char res = '$';
        
        for(int i=0; i<countArr.length; i++) {
        	if(countArr[i]>=0 && countArr[i]<minIdxFound) {
        		minIdxFound = countArr[i];
        		res = (char)(i+'a');
        	}
        }
        
        return res;
    }

}
