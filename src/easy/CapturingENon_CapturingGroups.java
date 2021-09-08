package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CapturingENon_CapturingGroups {
	static {
		try {
			System.setIn(new FileInputStream("CapturingENon_CapturingGroups"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var pattern = Pattern.compile("(ok){3,}");
			var matcher = pattern.matcher(scanner.nextLine());
			System.out.println(matcher.find());
		}

	}
}
