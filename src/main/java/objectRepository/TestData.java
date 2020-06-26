package objectRepository;

import java.util.Random;

public class TestData {
	
	protected static String fn;
	protected static String ln;
	protected static String phone;
	
	public static void fname() {
		String SALTCHARS = "abcdefghijkl";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 4) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		fn = salt.toString();
	}

	public static void lname() {
		String SALTCHARS1 = "mnopqrstuvwxyz";
		StringBuilder salt1 = new StringBuilder();
		Random rnd = new Random();
		while (salt1.length() < 4) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS1.length());
			salt1.append(SALTCHARS1.charAt(index));
		}
		ln = salt1.toString();
	}

	public static void phoneNum() {
		String SALTCHARS1 = "0123456789";
		StringBuilder salt1 = new StringBuilder();
		Random rnd = new Random();
		while (salt1.length() < 9) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS1.length());
			salt1.append(SALTCHARS1.charAt(index));
		}
		phone = salt1.toString();
	}

}
