package collection;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> allitems = new HashMap<>();

		allitems.put("micromax", 55);
		allitems.put("apple", 65);
		allitems.put("htc", 30);
		allitems.put("samsung", 20);
		System.out.println(allitems);
		System.out.println(allitems.get("htc"));
		System.out.println(allitems.containsKey("htc"));
		System.out.println(allitems.containsValue(30));

	}
	
}