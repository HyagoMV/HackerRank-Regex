package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExcludingSpecificCharacters {

	static {
		try {
			System.setIn(new FileInputStream("ExcludingSpecificCharacters"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		String notBeDigit = "\\D";
		String notBeLowercaseVowel = "[^aeiou]";
		String notBebcDF = "[^bcDF]";
		String notBeWhitspace = "\\S";
		String notbeUpperCaseVowel = "[^AEIOU]";
		String notBeDotOrCommon = "[^\\.,]";

		var pattern = Pattern.compile(
				notBeDigit + notBeLowercaseVowel + notBebcDF + 
				notBeWhitspace + notbeUpperCaseVowel + notBeDotOrCommon

		);
		var matcher = pattern.matcher(scanner.nextLine());
		System.out.println(matcher.matches());
	}

}
