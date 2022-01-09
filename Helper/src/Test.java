import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> dq = new LinkedList<Integer>();
		
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addFirst(3);
		
		dq.addLast(4);
		dq.addLast(5);
		dq.addLast(6);
		
		dq.removeLast();
		
		System.out.println(dq);

		
		
	}

}
