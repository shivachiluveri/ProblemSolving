package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapExample_LastProgramInClass {
	public static void main(String[] args) {
		String arrnames[] = { "kiran", "sunil", "kiran", "sai", "sai", "farooq", "sunil", "avinash", "kiran", "sai",
				"kiran" };
		TreeMap<String, Integer> allitems = new TreeMap<String, Integer>();
		for (String name : arrnames) {
			if (!allitems.containsKey(name)) {
				allitems.put(name, 1);
			} else {
				int count = allitems.get(name);
				count = count + 1;
				allitems.put(name, count);
			}
		}
		System.out.println(allitems);
	}
}