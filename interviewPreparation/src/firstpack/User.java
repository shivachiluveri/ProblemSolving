package firstpack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Java program to demonstrate working of predicates
//on collection. The program finds all admins in an
//arrayList of users.
class User {
	String name, role;

	User(String a, String b) {
		name = a;
		role = b;
	}

	String getRole() {
		return role;
	}

	String getName() {
		return name;
	}

	public String toString() {
		return "User Name : " + name + ", Role :" + role;
	}

	public static void main(String args[]) {
		List<User> users = new ArrayList<User>();
		users.add(new User("John", "admin_member"));
		users.add(new User("Peter", "admin"));
		List admins = process(users, (User u) -> u.getRole().equals("admin"));
		System.out.println(admins);
	}

	public static List<User> process(List<User> users, Predicate<User> predicate) {
		List<User> result = new ArrayList<User>();
		for (User user : users)
			if (predicate.test(user))
				result.add(user);
		return result;
	}
}

//Example 7: Predicate in Collection
