/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		String reverse = "";
		for (int i = (word.length()-1); i>=0; i--){
			char c = word.charAt(i);
			reverse += c;
	}
	System.out.println(reverse);
	System.out.println("The middle character is " + reverse.charAt(reverse.length()/2));
	}
}
