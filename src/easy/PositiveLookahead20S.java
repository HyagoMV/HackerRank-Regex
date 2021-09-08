package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PositiveLookahead20S {
	static {
		try {
			System.setIn(new FileInputStream("PositiveLookahead20S"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var pattern = Pattern.compile("o(?=oo)");
			while (scanner.hasNextLine()) {
				var matcher = pattern.matcher(scanner.nextLine());
				int count = 0;
				while (matcher.find()) count++;
				System.out.println("Number of matches : " + count);
				
			}
		}
	}
}
