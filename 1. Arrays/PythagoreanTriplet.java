
public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new PythagoreanTriplet().checkTriplet(
				new int[] {3, 2, 4, 6, 5}, 5));
	}
	
	boolean checkTriplet(int[] arr, int n) {
        
		int[] noArr = new int[1001];
		
		for(int ai: arr) {noArr[ai]++;}
		
		for(int i=1; i<noArr.length; i++) {
			for(int j=i+1; j<noArr.length; j++) {
				
				if(noArr[i]>0 && noArr[j]>0) {
					int res = i*i + j*j;
					int req = (int)Math.sqrt(res);
					if(req*req==res && noArr[req]>0) return true;
				}
			}
		}
		
		return false;
    }

}
