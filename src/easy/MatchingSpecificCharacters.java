package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingSpecificCharacters {
	
	static {
		try {
			System.setIn(new FileInputStream("MatchingSpecificCharacters"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var pattern = Pattern.compile("[1-3][0-2][0xs][30Aa][xsu][\\.,]");
		var matcher = pattern.matcher(scanner.nextLine());
		System.out.println(matcher.matches());
		
		
		
		
		
		
	}
}
