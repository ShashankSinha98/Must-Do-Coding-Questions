import java.util.Objects;
import java.util.Objects.*;
import java.util.Optional;
import java.util.function.Supplier;


public class Nonnull {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String cat = null;
		 * 
		 * if(nonNullSafeEval(new S() {
		 * 
		 * @Override public Object get() { // TODO Auto-generated method stub return
		 * cat; } })) { System.out.println("Cat is not null"); } else {
		 * System.out.println("Cat is null"); }
		 */
		
		B b = new B();
		A a = b;
		a.show();
	}
	
	public static <T> boolean nonNullSafeEval(S<T> s) {
		try {
			return s.get() != null;
		} catch (NullPointerException npe) {
			return false;
		}
	}	
}

interface S<T> {
	T get();
}

class A {
	
	String a = "a";
	
	static B getB() {
		return null;
	}
	
	void show() {
		System.out.println("A show");
	}
}

class B extends A{
	String b = "b";
	
	String getVar() {
		return b;
	}
	
	void show() {
		System.out.println("B show");
	}
}
