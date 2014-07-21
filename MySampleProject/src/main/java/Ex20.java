
public class Ex20 {
	
	public static void main (String args[]) {
		
		SimpleCount<Double> doubleCounter = new SimpleCount<Double>();
		SimpleCount<Integer> integerCounter = null;
		SimpleCount rawCounter = new SimpleCount ();
		
		System.out.println("SimpleCount<Double> count is " + doubleCounter.getCount());
		System.out.println("SimpleCount<Integer> count is " + integerCounter.getCount());
		System.out.println("SimpleCount count is " + rawCounter.getCount());
	}
}

class SimpleCount<T> {
	private static int count = 0;
	public SimpleCount () {
		count++;
	}
	static int getCount () {
		return count;
	}
}
