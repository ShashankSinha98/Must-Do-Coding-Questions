
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}

interface TestInterface {
	int a = 10;
	
	int testFn();
	
	default boolean testDef() {
		return true;
	}
}

class TestClass implements TestInterface {

	@Override
	public int testFn() {
		return -1;
	}
	
	@Override
	public boolean testDef() {
		return false;
	}
	
}