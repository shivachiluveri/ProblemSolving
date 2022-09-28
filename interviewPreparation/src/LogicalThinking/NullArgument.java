package LogicalThinking;

public class NullArgument {
//Pass null argument with method overloading of String and Object types
	public static void main(String[] args) {
		NullArgument ob = new NullArgument();
		ob.m1(null);
	}
	public void m1(Object o) {
		System.out.println("Im in Object method");
	}
	public void m1(String s) {
		System.out.println("Im in String method");
	}
	/*
	 * public void m1(StringBuffer sb) { System.out.println("Im in String method");
	 * compile time error
	 * }
	 */
}
