package firstpack;

import java.util.Scanner;

public class BooleanExamaples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findTrues();
	}

	public static void numCheck() {

		int a = 17, b = 47;

		Boolean isGreater = true;
		boolean isNotGreater = false;

		if (a < b) {
			System.out.println(isGreater);

		} else
			System.out.println(isNotGreater);

	}

	public static void checkPrime() {
		int num = 71;

		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("is prime number");
		else
			System.out.println("not a prime");

	}

	public static void findTrues() {

		// create 3 boolean variables
		boolean first;
		boolean second;
		boolean third;
		boolean result;

		// get boolean input from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first boolean value: ");
		first = input.nextBoolean();

		System.out.print("Enter second boolean value: ");
		second = input.nextBoolean();

		System.out.print("Enter third boolean value: ");
		third = input.nextBoolean();

		// check if two are true
		if (first) {

			// if first is true
			// and one of the second and third is true
			// result will be true
			result = second || third;
		} else {

			// if first is false
			// both the second and third should be true
			// so result will be true
			result = second && third;
		}

		if (result) {
			System.out.println("Two boolean variables are true.");
		} else {
			System.out.println("Two boolean variables are not true.");
		}

		input.close();
	}

}
