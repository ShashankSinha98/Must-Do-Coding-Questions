
public class ImplementStrstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(strstr("GeeksForGeeks", "Fo1r"));
	}
	
	static int strstr(String s, String x)
    {
        for(int i=0; i<=s.length()-x.length(); i++) {
        	if(s.substring(i,i+x.length()).equals(x)) return i;
        }
        return -1;
    }

}
