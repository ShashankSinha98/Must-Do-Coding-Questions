import java.util.*;
public class ActivitySelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] st = new int[] {1, 3, 2, 5};
		int[] end = new int[] {2, 4, 3, 6};
		
		int ans = activitySelection(st, end, st.length);
		System.out.println("Ans: "+ans);
	}
	
	
	 public static int activitySelection(int start[], int end[], int n) {
        
		 if(n==0) return 0;
		 
		 List<Activity> activities = new ArrayList<>();
		 for(int i=0; i<n; i++) activities.add(new Activity(start[i], end[i]));
		 
		 Comparator<Activity> activityComparator = (a1, a2) -> a1.finish - a2.finish;
		 Collections.sort(activities, activityComparator);
		 
		 int count = 1;
		 int i=0, j=i+1;
		 
		 while(j<n) {
			 if(activities.get(i).finish < activities.get(j).start) {
				 count++;
				 i=j;
				 j++;
			 } else {
				 j++;
			 }
		 }
		 return count;
    }
	 
	

}

class Activity {
	int start, finish;
	
	public Activity(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(st: "+start+", fin: "+finish+")";
	}
}
