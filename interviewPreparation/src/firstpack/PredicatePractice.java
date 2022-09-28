package firstpack;
import java.util.function.Predicate;
public class PredicatePractice {
	public static void main(String[] args) {
		//createPredicate();
		predicateChaining();
	}
	public static void createPredicate() {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 1008);
		// Calling Predicate method
		System.out.println(lesserthan.test(1900));
	}
	public static void predicateChaining() {
		Predicate<Integer> greaterThan = (i) -> i>10;
		Predicate<Integer> lowerThan = (i) -> i<20;		
		boolean result = greaterThan.and(lowerThan).test(150);
		if(result)
		System.out.println("the num is less than 20 and greater than 10");
		else
			System.out.println("condition not matched");
	}

}
//Example 3: Predicate in to Function
//Example 4: Predicate OR
//Example 5: Predicate AND
//Example 6: Predicate negate()
//Example 7: Predicate in Collection
//find admin in users
