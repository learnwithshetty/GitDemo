package Fresh;

public class Stringmethods {

	public static void main(String[] args) {
		
		String S ="  Welcome ";
		String S1="Learn with Shetty";
		
		System.out.println(S.length());  // used for calculating the length of the string
		System.out.println(S1.concat(S));  // used to combine two strings
		System.out.println(S.trim()); //will remove right & left spaces
		System.out.println(S.charAt(4)); // returns a char value at the given index number
		System.out.println(S.contains("with"));  // Searches the sequence of characters in the string
		System.out.println(S.equals("  welcome "));  // Compares the two given strings based on the content of the string
		System.out.println(S.equalsIgnoreCase("  welcome "));  // compares & ignores the case sensitive
		System.out.println(S.substring(0, 5)); // This is for finding substring
		System.out.println(S.toLowerCase()); // To convert everything to lowercase
		System.out.println(S.toUpperCase());  // To convert eberything to upper case
	}

}
