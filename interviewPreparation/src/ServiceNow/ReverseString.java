package ServiceNow;
/*convert string to character as below
String str = "shiva";
char charArray[] = str.toCharArray();*/

public class ReverseString {

	public static void reverseString(char[] str) {
		int i = 0;
		int j = str.length - 1;
		while (i < j) {
			if (!Character.isAlphabetic(str[i])) {
				i++;
			} else if (!Character.isAlphabetic(str[j])) {
				j--;
			} else {
				char temp = str[i];
				str[i] = str[j];
				str[j] = temp;
				i++;
				j--;
			}
		}

	}

	public static void main(String[] args) {
		String str = "a$b,*c\"d:e";
		char charArray[] = str.toCharArray();
		System.out.println("input is         :  " + str);
		 reverseString(charArray);
		String os = new String(charArray);
		System.out.println("output string is :  " + os);
	}

}