package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class DetectHTMLTags10S {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("DetectHTMLTags10S-TC1"));
			Set<String> set = new TreeSet<String>();
			try (var s = new Scanner(System.in)) {
				s.nextLine();
				while (s.hasNextLine()) {
					var in = s.nextLine();
					var p = Pattern.compile(
							"(?<=<)\\s*[a-z0-9-]+");
					var m = p.matcher(in);
					while (m.find()) {
						set.add(m.group());
					}
				}
				System.out.println(
						set.toString()
							.replaceAll("\\[|\\]", "")
							.replaceAll(", ", ";")
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
