
public class LastIndexOfOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new LastIndexOfOne()
				.lastIndex("00001"));
	}
	
	public int lastIndex( String s) {
    
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i)==('1')) return i;
		}
		return -1;
        
    }

}
