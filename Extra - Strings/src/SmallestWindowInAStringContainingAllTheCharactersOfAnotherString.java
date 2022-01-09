import java.util.HashMap;
import java.util.Map;

public class SmallestWindowInAStringContainingAllTheCharactersOfAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(smallestWindow("timetopractice", "toc"));
		
	}
	

	public static String smallestWindow(String s, String p)
    {
        if(s.length() < p.length()) return "-1";
        
        int[] pattMap = new int[26];
        for(char pi: p.toCharArray()) pattMap[pi-'a']++;
        
        int[] strMap = new int[26];
        int st=-1, end=-1;
        
        int lim = s.length();
        int minLen = Integer.MAX_VALUE;
        int minSt=-1, minEnd=-1;
        
        while(st<lim && end<lim) {
        	
        	if(!isValid(pattMap, strMap) ) {
        		end++;
        		if(end<lim) strMap[s.charAt(end)-'a']++;
        	} else {
        		
        		if(end-st<minLen) {
        			minLen = end-st;
        			minSt = st+1;
        			minEnd = end;
        		}
        		
        		st++;
        		strMap[s.charAt(st)-'a']--;
        	}
        }
        
       return minSt==-1 ? "-1": s.substring(minSt, minEnd+1);
    }
	
	private static boolean isValid(int[] pattMap, int[] strMap) {
		
		for(int i=0; i<pattMap.length; i++) {
			if(pattMap[i]>strMap[i]) return false;
		}
		
		return true;
	}
}
