package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingEndingItems {
	static {
		try {
			System.setIn(new FileInputStream("MatchingEndingItems"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var pattern = Pattern.compile(
					"^[A-z]*s$");
			var matcher = pattern.matcher(scanner.nextLine());
			System.out.println(matcher.matches());
		}

	}
}
