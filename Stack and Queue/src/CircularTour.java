
public class CircularTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new CircularTour().tour(
				new int[] {6,7,4,10,6,5}, new int[] {5,6,7,8,6,4}));
	}
	
	int tour(int petrol[], int distance[])
    {
		if(!isTravelPossible(petrol, distance)) return -1;
		
		int f, r, balance, lim, cnt;
		f = r = balance = cnt = 0;
		lim = petrol.length;
		
		
		while(cnt!=lim) {
			// System.out.println("f: "+f+" r: "+r);
			
			if(balance+petrol[f]<distance[f]) {
				f = increment(f, lim);
				r = f;
				balance = 0;
				cnt = 0;
			} else {
				balance += petrol[f] - distance[f];
				f = increment(f, lim);
				cnt++;
			}
		}
		
		return r;
    }
	
	private int increment(int i, int lim) {
		if(i+1<lim) return i+1;
		else return 0;
	}
	
	private boolean isTravelPossible(int[] petrol, int[] distance) {
		
		int totalDistance = 0;
		int totalPetrol = 0;
		
		for(int p: petrol) totalPetrol+=p;
		
		for(int d: distance) totalDistance+=d;
		
		return totalDistance<=totalPetrol;
	}

}
