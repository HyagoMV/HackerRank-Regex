package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLlinks10S {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("DetectHTMLlinks10S-TC3"));

			try (var s = new Scanner(System.in)) {
				while (s.hasNextLine()) {
					var in = s.nextLine();

					var g1 = "((?<=href=\")[^\"]+)";
					var g2 = "([^<])+";
					var g3 = "((?<=<b>|\">|\\>)[^<]*(?=</b|</a))";
					
					var pattern = Pattern.compile(g1 + g2 + g3);
					var matcher = pattern.matcher(in);

					while (matcher.find()) {
						System.out.println(matcher.group(1) + "," + matcher.group(3));
					}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
