package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateSet {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
	names.add("shiva");
	names.add("loukya");
	names.add("sam");
	names.add("shiva");
	
	Set<String> s = new HashSet<>();
	
	for(String name : names) {
		
		if(s.add(name)==false) {
			System.out.println(name);
		}
	}
	
	
}
}
