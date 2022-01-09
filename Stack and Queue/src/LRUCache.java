import java.util.*;
public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL l = new DLL();
		Node n1 = l.add(1, 2);
		Node n2 = l.add(2, 2);
		Node n3 = l.add(3, 2);
		Node n4 = l.add(4, 2);
		Node n5 = l.add(5, 2);
		
		System.out.println(l);
		
		l.remove(n1);
		l.remove(n1);
		
		System.out.println(l);
		
	}
	
	static DLL dll;
	static int capacity;
	static HashMap<Integer, Node> map;
	
    LRUCache(int cap)
    {
    	dll = new DLL();
    	capacity = cap;
    	map = new HashMap<>();
    }

    
    public static int get(int key)
    {
    	if(map.containsKey(key)) {
    		Node n = map.get(key);
    		dll.remove(n);
    		Node nn = dll.add(n.data, n.value);
    		map.put(n.data, nn);
    		
    		return n.value;
    	} 
    	
    	return -1;
    }

    
    public static void set(int key, int value)
    {
         
	   if(map.containsKey(key)) {
    	   Node n = map.get(key);
    	   dll.remove(n);
    	   Node nn = dll.add(key, value);
    	   map.put(key, nn);
    	   
	   } else if(dll.size<capacity) {
		   Node nn = dll.add(key, value);
		   map.put(key, nn);
	   } else if(dll.size==capacity) {
		   Node on = dll.head;
		   dll.remove(on);
		   map.remove(on.data);
		   
		   Node nn = dll.add(key, value);
		   map.put(key, nn);
	   }
	   //System.out.println(dll);
    
    }

}



class Node {
	int data, value;
	Node next, prev;
	
	public Node(int data, int value) {
		this.data = data;
		this.value = value;
		prev = next = null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(d: "+data+", v: "+value+") -> ";
	}
}

class DLL {
	Node head, tail;
	int size = 0;
	
	public DLL() {
		head = tail = null;
		size = 0;
	}
	
	public Node add(int key, int value) {
		Node nn = new Node(key, value);
		if(size==0) 
			head = tail = nn;
		else {
			tail.next = nn;
			nn.prev = tail;
			tail = nn;
		}
		size++;
		
		return nn;
	}
	
	public void remove(Node n) {
		if(head==n && tail==n) 
			head = tail = null;
		else if(head==n) {
			Node nn = head.next;
			nn.prev = null;
			head = nn;
		} else if(tail==n) {
			Node pn = tail.prev;
			pn.next = null;
			tail = pn;
		} else {
			Node nn = n.next;
			Node pn = n.prev;
			pn.next = nn;
			nn.prev = pn;
		}
		size--;
	}
	
	@Override
	public String toString() {
		String res = "";
		Node temp = head;
		while(temp!=null) {
			res+= temp;
			temp = temp.next;
		}
		return res;
	}

}
