package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
	Task:
 		You have a test string S.
		Your task is to write a regex that will match S using the following conditions:

 		* S should begin with 1 or more digits.
		* After that, S should have 1 or more uppercase letters.
 		* S should end with 1 or more lowercase letters
 */
public class MatchingOneOrMoreRepetitions {

	static {
		try {
			System.setIn(new FileInputStream("MatchingOneOrMoreRepetitions"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var pattern = Pattern.compile(
					"^\\d+[A-Z]+[a-z]+$");
			var matcher = pattern.matcher(scanner.nextLine());
			System.out.println(matcher.matches());
		}

	}

}
