package medium;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Buildinga_Smart_IDE_Programming_Language_Detection_Score_30 {

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("BuildingaSmartIDE_ProgrammingLanguageDetection-STC0"));

			try (var s = new Scanner(System.in)) {
				while (s.hasNextLine()) {
					var matcher = Pattern.compile("(?:((?:import|package)\\s+[a-zA-z_.*]+;|\\b(?:public)\\b)|(#(?:include|define))|(\\B#|\\bdef\\b|class\\s+[a-zA-z]+:))").matcher(s.nextLine());
					if (matcher.find()) {
						if (matcher.group(1) != null) {							
							System.out.println("Java");
							return;
						}
						if (matcher.group(2) != null) {							
							System.out.println("C");
							return;
						}
						else {
							System.out.println("Python");
							return;							
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
