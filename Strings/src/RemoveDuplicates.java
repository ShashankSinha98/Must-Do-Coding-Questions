
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(removeDups("gfg"));
	}
	
	static String removeDups(String S) {
        
		int[] mem = new int[26];
		
		String res = "";
		
		for(char c: S.toCharArray()) {
			if(mem[c-'a']==0) { mem[c-'a']++; res+=c;}
		}
		
		S = res;
		return res;
    }

}
