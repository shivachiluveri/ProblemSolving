package stringOperations;

public class FirstLetterCapital1 {
	public  static void main(String args[]) {
		System.out.println(capitalize("javatpoint"));
		System.out.println(capitalize("website"));
		System.out.println(capitalize("@javatpoint"));
		System.out.println(capitalize("it is the best website to learn technology."));
	}

//user-defined function to capitalize the first letter also check for null string  
	public static final String capitalize(String str) {
		if (str == null || str.length() == 0)
			return str;
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}	