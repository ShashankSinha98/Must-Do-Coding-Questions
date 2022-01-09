import java.util.*;


public class SwapAllOddAndEvenBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = swapBits(23);
		System.out.println(ans);

	}
	
	
	public static int swapBits(int n) 
    {
	    long odd = Long.parseLong("01010101010101010101010101010101",2);
	    long even = Long.parseLong("10101010101010101010101010101010",2);
	    
	    long oddPlaces = n & odd;
	    long evenPlaces = n & even;
	    
	    return (int)(oddPlaces<<1 | evenPlaces>>1);
	}

}
