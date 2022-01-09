
public class CheckIfStringIsRotatedByTwoPlaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isRotated("geeksforgeeks", "geeksgeeksfor"));
	}
	
	public static boolean isRotated(String str1, String str2)
    {
        return rotateClockwise(str1).equals(str2) || rotateAntiClockwise(str1).equals(str2);
    }
	
	private static String rotateClockwise(String S) {
		
		if(S.length()<=2) return S;
		
		int n = S.length();
		
		return S.substring(n-2) + S.substring(0,n-2);
	}
	
	private static String rotateAntiClockwise(String S) {
		
		if(S.length()<=2) return S;
		
		int n = S.length();
		
		return  S.substring(2) + S.substring(0,2) ;
	}

}
