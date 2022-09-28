package collection;

import java.util.ArrayList;

public class ArrayExample {
	public static void main(String[] args) {
//		int arr1[] = new int[5];
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		arr1[0] = 5;
		arr1.add(5);
//		arr1[1] = 3;
		arr1.add(3);
//		arr1[2] = 8;
		arr1.add(8);
//		arr1[3] = 1;
		arr1.add(1);
//		arr1[4] = 2;
		arr1.add(4);

		for (int ele : arr1) {
			System.out.println(ele);
		}

		System.out.println("Add new values to the arraylist");
//		arr1[5] = 16;
		arr1.add(16);
		for (int ele : arr1) {
			System.out.println(ele);
		}

	}
}