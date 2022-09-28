package firstpack;

import java.util.*;

public class HashMapPractice {
	public static void main(String[] args) {
		   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap 
		   map.put(1,"mango");
		   map.put(2,"banana");
		   map.put(3,"gua");
		   map.put(4,"papaya");
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}
}
