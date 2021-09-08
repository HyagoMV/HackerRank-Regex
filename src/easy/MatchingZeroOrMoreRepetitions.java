package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
	Task:
 		You have a test string S.
		Your task is to write a regex that will match S using the following conditions:

 		* S should begin with 2 or more digits.
		* After that, S should have 0 or more lowercase letters.
 		* S should end with 0 or more uppercase letters
 */
public class MatchingZeroOrMoreRepetitions {

	static {
		try {
			System.setIn(new FileInputStream("MatchingZeroOrMoreRepetitions"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var pattern = Pattern.compile(
					"^\\d{2,}[a-z]*[A-Z]*$");
			var matcher = pattern.matcher(scanner.nextLine());
			System.out.println(matcher.matches());
		}

	}

}
