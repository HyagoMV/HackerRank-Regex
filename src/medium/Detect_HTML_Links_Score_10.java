package medium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Detect_HTML_Links_Score_10 {
	public static void main(String[] args) {
		try (var scanner = new Scanner(new FileInputStream("Detect_HTML_Links_Score_10_TC1"))) {
			scanner.findAll("<a\\s+.*?href=\\\"(.+?)\\\".*?>\s*(?:<.+?>)*(.*?)\s*</")
					.forEach(mr -> System.out.printf("%s,%s%n", mr.group(1), mr.group(2)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
