import java.util.ArrayList;

public class RotateBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(rotate(6335, 26501));
		System.out.println(rotateOptimized(6335, 26501));
	}
	
	private static final int MAX_BITS = 16;
	
	static ArrayList<Integer> rotate(int N, int D)
    {
        ArrayList<Integer> res = new ArrayList<>();
        
        D = D % MAX_BITS;
        int maxNo = (1<<(MAX_BITS))-1;
        
        
        int _N = N;
        
        for(int i=0; i<D; i++) {
        	if((_N & (1<<(MAX_BITS-1)))>0) {
        		_N = (_N << 1);
        		_N = _N | 1;
        	} else {
        		
        		_N = _N << 1;
        	}
        	
        }
        
        res.add(_N & maxNo);
        
        _N = N;
        for(int i=0; i<D; i++) {
        	if((_N & 1)==1) {
        		_N = _N >> 1;
        		_N = _N | (1<<(MAX_BITS-1));
        	} else {
        		_N = _N >> 1;
        	}
        }
       
        res.add(_N & maxNo);
        
        return res;
        
    }

	static ArrayList<Integer> rotateOptimized(int N, int D) {
		D = D % MAX_BITS;
		
		int maxNo = (1<<MAX_BITS)-1;
		ArrayList<Integer> res = new ArrayList<>();
		
		int left = ((N<<D) | (N>>(MAX_BITS-D))) & maxNo;
		int right = ((N>>D) | (N<<(MAX_BITS-D))) & maxNo;
		
		res.add(left);
		res.add(right);
		
		return res;
		
	}
	
}
