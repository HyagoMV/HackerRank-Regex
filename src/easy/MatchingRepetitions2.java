package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
	Task:
		You have a test string S.
		Your task is to write a regex that will match S using the following conditions:

	 	* S	should begin with 1 or 2 digits.
		* After that, S should have 3 or more letters (both lowercase and uppercase).
		* Then S should end with up to 3 . symbol(s). You can end with  to 0 . 3 symbol(s), inclusively.
 */
public class MatchingRepetitions2 {

	static {
		try {
			System.setIn(new FileInputStream("MatchingRepetitions2"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {

			var shouldBeginWith1Or2Digits = "\\d{1,2}";
			var shouldHave3OrMoreLetters = "[A-z]{3,}";
			var shouldEnd3Dot = "\\.{0,3}";

			var pattern = Pattern.compile(
					shouldBeginWith1Or2Digits + 
					shouldHave3OrMoreLetters + 
					shouldEnd3Dot);
			var matcher = pattern.matcher(scanner.nextLine());
			System.out.println(matcher.matches());
		}

	}

}
