import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class N_MeetingsInOneRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] st = new int[] {1,3,0,5,8,5};
		int[] end = new int[] {2,4,6,7,9,9};
		
		int ans = maxMeetings(st, end, st.length);
		System.out.println("Ans: "+ans);
	}
	
	public static int maxMeetings(int start[], int end[], int n) {
	
		if(n==0) return 0;
		 
		 List<Meeting> meetings = new ArrayList<>();
		 for(int i=0; i<n; i++) meetings.add(new Meeting(start[i], end[i]));
		 
		 Comparator<Meeting> meetingComparator = (m1, m2) -> m1.finish - m2.finish;
		 Collections.sort(meetings, meetingComparator);
		 
		 int count = 1;
		 int i=0, j=i+1;
		 
		 while(j<n) {
			 if(meetings.get(i).finish < meetings.get(j).start) {
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

class Meeting {
	int start, finish;
	
	public Meeting(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(st: "+start+", fin: "+finish+")";
	}
}
