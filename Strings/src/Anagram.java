import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(isAnagram("allergy", "allergic"));
	}
	
	//Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        int[] map = new int[26];
        
        for(char c: a.toCharArray()) {
        	map[c-'a']++;
        }
        
        for(char c: b.toCharArray()) {
        	map[c-'a']--;
        }
        
        for(int i: map) {
        	if(i!=0) return false;
        }
        
        return true;
    }

}
