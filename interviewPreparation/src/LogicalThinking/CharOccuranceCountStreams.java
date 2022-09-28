package LogicalThinking;

public class CharOccuranceCountStreams {
//Pass null argument with method overloading of String and Object types
	public static void main(String[] args) {
		//Count the Number of Occurrences of a Character in a String using Java 8 Streams?
			String str = "shiva kumar chiluveri";
			long count = str.chars().filter(e -> (char)e=='p').count();
			System.out.println(count);
	}
	
}
