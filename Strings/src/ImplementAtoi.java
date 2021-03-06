
public class ImplementAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(atoi("10a"));
	}
	
	static int atoi(String str)
    {
		boolean isNeg = str.charAt(0)=='-';
		
		int st = (isNeg)?1:0;
		for(int i=st; i<str.length(); i++) 
			if(!((str.charAt(i)-'0')>=0 &&(str.charAt(i)-'0')<=9)) return -1;
		
		int res = 0;
		
		for(int i=st; i<str.length(); i++) {
			res = res*10 + (str.charAt(i)-'0');
		}
		
		return (isNeg)?-res:res;
    }

}
