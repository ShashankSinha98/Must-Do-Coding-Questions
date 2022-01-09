import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ispar("([]"));
	}
	
	static boolean ispar(String x)
    {
		if((x.length() & 1)!=0) return false;
		
        int len = x.length();
        int i=0;
        
        
        Stack<Character> st = new Stack<>();
        
        while(i<len) {
        	
        	char c = x.charAt(i);
        	
        	if(c=='[' || c=='(' || c=='{') {
        		st.add(c);
        	} else {
        		if(st.isEmpty()) return false;
        		else if(!isPair(st.peek(), c)) return false;
        		else {
        			st.pop();
        		}
        	}
        	
        	i++;
        }
        
        return st.isEmpty();
    }
	
	private static boolean isPair(char open, char close) {
		
		if(open=='{') return close=='}';
		else if(open=='(') return close==')';
		else if(open=='[') return close==']';
		
		return false;
	}

}
