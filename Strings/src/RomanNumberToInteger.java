import java.util.*;
public class RomanNumberToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(romanToDecimal("MCMLXXXIV"));
		
	}
	
	public static int romanToDecimal(String str) {
		
		int n = str.length();
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50); map.put('C', 100); map.put('D', 500); map.put('M', 1000);
		
		
		int res = 0;
		for(int i=0; i<n; i++) {
			if(i>0 && map.get(str.charAt(i))>map.get(str.charAt(i-1))) {
				res += map.get(str.charAt(i)) - 2*(map.get(str.charAt(i-1)));
			} else {
				res += map.get(str.charAt(i));
			}
		}
		return res;
		
    }
	
	

}
