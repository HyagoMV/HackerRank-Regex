package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingWordBoundaries {
	static {
		try {
			System.setIn(new FileInputStream("MatchingWordBoundaries"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var pattern = Pattern.compile(
					"\\b[aeiouAEIOU][A-Za-z]*\\b");
			var matcher = pattern.matcher(scanner.nextLine());
			System.out.println(matcher.find());
		}

	}
}
