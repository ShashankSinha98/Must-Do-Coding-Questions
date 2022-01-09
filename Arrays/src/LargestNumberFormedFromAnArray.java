import java.math.BigInteger;
import java.util.*;



public class LargestNumberFormedFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new LargestNumberFormedFromAnArray().printLargest(new String[] {"3", "30", "34", "5", "9"}));
		System.out.println(new LargestNumberFormedFromAnArray().printLargest(new String[] {"54", "546", "548", "60"}));
	}
	
	String printLargest(String[] arr) {
        
		ArrayList<String> strArr = new ArrayList<>();
		
		for(String s: arr) { strArr.add(s); }
		
		Collections.sort(strArr, new CustomSort());
		
		String res = "";
		
		for(String s: strArr) { res+=s; }
		
		return res;
    }
	
	class CustomSort implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			
			CustomBigInteger b1 = new CustomBigInteger(s1+s2);
			CustomBigInteger b2 = new CustomBigInteger(s2+s1);
		
			
			return -b1.compareTo(b2);
			
		}
		
	}
	
	class CustomBigInteger {
		
		private	String val;
		
		public CustomBigInteger(String val) {
			this.val = val;
		}
		
		
		public	int compareTo(CustomBigInteger b2) {
			String s1 = val;
			String s2 = b2.val;
			
			return s1.compareTo(s2);
		}
	}

}
