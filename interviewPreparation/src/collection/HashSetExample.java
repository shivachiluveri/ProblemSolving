package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> arr1 = new HashSet<String>();
		arr1.add("avinash");
		arr1.add("sai");
		arr1.add("farooq");
		arr1.add("sunil");
		arr1.add("avinash");
		arr1.add("avinash");
		arr1.add("farooq");
		for (String ele : arr1) {
			System.out.println(ele);
		}
	}
}