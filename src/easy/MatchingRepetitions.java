package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingRepetitions {

	static {
		try {
			System.setIn(new FileInputStream("MatchingRepetitions"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {

			var first40Characters = "[A-z02468]{40}";
			var laslt5Characters = "[\\s13579]{5}";

			var pattern = Pattern.compile(
					first40Characters + laslt5Characters);
			var matcher = pattern.matcher(scanner.nextLine());
			System.out.println(matcher.matches());
		}
	}

}
