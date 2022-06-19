import java.util.*;
public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<Integer> common_element(ArrayList<Integer> v1, ArrayList<Integer> v2)
    {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i: v1) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			} else {
				map.put(i, 1);
			}
		}
		
		ArrayList<Integer> res = new ArrayList<>();
		for(int i: v2) {
			if(map.containsKey(i) && map.get(i)!=0) {
				res.add(i);
				map.put(i, map.get(i)-1);
			}
		}
		
		Collections.sort(res);
		return res;
    }

}
