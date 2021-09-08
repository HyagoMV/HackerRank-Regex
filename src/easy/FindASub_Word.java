package easy;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindASub_Word {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("FindASub_Word10S-STC0"));
			try (var s = new Scanner(System.in)) {
				var n = s.nextInt();
				s.nextLine();// Clean buffer

				var sb0 = new StringBuilder();
				for (var i = 0; i < n; i++) {
					sb0.append(s.nextLine()).append(" ");
				}

				s.nextLine();// Clean buffer
				while (s.hasNextLine()) {
					var p = Pattern.compile("(?<=\\w)" + s.nextLine() + "(?=\\w)");
					var m = p.matcher(sb0);
					var counter = 0;
					while (m.find()) {
						counter++;
					}
					System.out.println(counter);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
