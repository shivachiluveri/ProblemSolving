package basicPrograms;

import java.util.Scanner;
public class CountTheWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hi");
		Scanner ip = new Scanner(System.in);
		String text = ip.nextLine();
		int count=1;	
		for(int i=0;i<=text.length()-1;i++) {
			if((text.charAt(i)==' ')&&(text.charAt(i+1)!=' '))
				count++;
		}
		System.out.println(count);
	}
}
