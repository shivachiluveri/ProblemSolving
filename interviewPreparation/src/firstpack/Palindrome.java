/**
 * 
 */
package firstpack;

/**
 * @author shiva
 *
 */
public class Palindrome {

	/**
	 * 
	 */
	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//palindromeNum();
		palStr();

	}

	public static void palindromeNum() {

		int a, temp, sum, r;

		a = 454545;
		temp = a;
		sum = 0;

		while (a > 0) {
			r = a % 10;

			sum = (sum * 10) + r;

			a = a / 10;

		}

		if (temp == sum)
			System.out.println("is pal");
		else
			System.out.println("not a pal");

	}
public static void palStr() {
String s= "alol", revStr="";
int i= s.length();
for(int a=(i-1);a>=0;--a) {
	revStr = revStr + s.charAt(a);
}

if(s.equalsIgnoreCase(revStr)) {
	System.out.println("is palindrome!!");
}
else {
	System.out.println("is not a pal");
}
}
public static void stringSpl() {
	
	
}
}












