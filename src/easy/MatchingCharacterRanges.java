package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingCharacterRanges {

	static {
		try {
			System.setIn(new FileInputStream("MatchingCharacterRanges"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		var mustBeLowercaseAlphavetic = "[a-z]";
		var mustBePositiveDigit = "\\+?[1-9]";
		var notBeLowercaseAlphavetic = "[^a-z]";
		var notBeUppercaseAlphavetic = "[^A-Z]";
		var mustBeUppercaseAlphavetic = "[A-Z]";
		var equalsOrGreaterThan5 = ".*";

		var pattern = Pattern.compile(
				mustBeLowercaseAlphavetic + mustBePositiveDigit + 
				notBeLowercaseAlphavetic + notBeUppercaseAlphavetic + 
				mustBeUppercaseAlphavetic + equalsOrGreaterThan5);
		var matcher = pattern.matcher(scanner.nextLine());
		System.out.println(matcher.matches());

	}

}
