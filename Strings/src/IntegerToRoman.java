import java.util.*;
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3999;
		String roman = new IntegerToRoman().intToRoman(n);
		System.out.println("res: "+roman);

	}
	
	static HashMap<Integer, String> map;

	static {
		map = new HashMap<>();
		
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
	}

	
	public String intToRoman(int num) {
		
		String res = "";
		int base = 1;
		
		while(num!=0) {
			int n = num%10;
			
			String roman = getRoman(n, base);
			res = roman + res;
			
			num = num/10;
			base*=10;
		}
        
		return res;
    }
	
	private static String getRoman(int n, int base) {
		
		if(n<=3) {
			String ch = map.get(base);
			return repeat(ch, n);
		
		} else if(n==4) {
			int _b = 5*base;
			String end = map.get(_b);
			String st = map.get(base);
			return st + end;
		
		} else if(n==5) {
			return map.get(n*base);
		
		} else if(n<=8) {
			int _b = 5*base;
			String st = map.get(_b);
			String end = map.get(base);
			return st + repeat(end, n-5);
		
		} else if(n==9) {
			int _b = 10*base;
			String end = map.get(_b);
			String st = map.get(base);
			return st+end;
		}
		
		else if(n==0) {
			return "";
		}
		
		return null;
	}
	
	private static String repeat(String s, int times) {
		StringBuilder res = new StringBuilder();
		while(times--!=0) {
			res.append(s);
		}
		return res.toString();
	}
}
