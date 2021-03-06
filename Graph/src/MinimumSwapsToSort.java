import java.util.*;

public class MinimumSwapsToSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {10, 19, 6, 3, 5};
		int ans = new MinimumSwapsToSort().minSwaps(arr);
		System.out.println("ans: "+ans);
	}
	
	public int minSwaps(int nums[]) {
	
		LNode[] nodeList = new LNode[nums.length];
		for(int i=0; i<nums.length; i++) {
			nodeList[i] = new LNode(nums[i], i);
		}
		
		Comparator<LNode> comp = (l1, l2) -> l1.value - l2.value;
		Arrays.sort(nodeList, comp);
		
		//System.out.println("nodeList: "+Arrays.toString(nodeList));
		
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nodeList[i].idx!=i) {
				count++;
				swap(nodeList, nodeList[i].idx, i);
				i--;
			}
		}
		
		return count;
    }
	
	private <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

class LNode {
	int value, idx;
	public LNode(int value, int idx) {
		this.value = value;
		this.idx = idx;
	}
	
	@Override
	public String toString() {
		return "(v: "+value+", idx: "+idx+")";
	}
}
