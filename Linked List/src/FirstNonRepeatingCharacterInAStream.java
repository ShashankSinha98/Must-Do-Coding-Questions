import java.util.LinkedList;


public class FirstNonRepeatingCharacterInAStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(FirstNonRepeating("abbcdaf"));

	}
	
	public static String FirstNonRepeating(String A)
    {
        // code here
        int[] dp = new int[26];
        
        LinkedList<String> ll = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        
        for(char c: A.toCharArray()) {
        	
        	dp[c-'a']++;
        	
        	if(dp[c-'a']==1) ll.add(""+c);
        	else ll.remove(""+c);
        	
        	res.append((ll.isEmpty()) ? '#' : ll.get(0));
        }
        return res.toString();
    }
	


}
