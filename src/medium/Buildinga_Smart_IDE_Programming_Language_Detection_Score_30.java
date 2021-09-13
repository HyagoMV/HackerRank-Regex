package medium;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Buildinga_Smart_IDE_Programming_Language_Detection_Score_30 {

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("BuildingaSmartIDE_ProgrammingLanguageDetection-STC1-part2"));

			try (var s = new Scanner(System.in)) {
				var cP = Pattern.compile("^#include\\s*[<\\\"].+[>\\\"]");
				var javaP = Pattern.compile("^\\s*((package)|(import))\\s+[\\w\\.\\*]+\\s*;$");
				var phytonP = Pattern.compile("^((from\\s+[\\w\\.]+\\s+)(import\\s+[\\w\\.]+)(\\s+as\\s+[\\w\\.]+)?|(#.*)|(def\\s.*\\(.*\\):))$");
				
				while (s.hasNextLine()) {
					var line = s.nextLine();
					var cM = cP.matcher(line);
					var javaM = javaP.matcher(line);
					var phytonM = phytonP.matcher(line);
					
					if (cM.find()) {
						System.out.println("C");
						return;
					}
					if (javaM.find()) {
						System.out.println("Java");
						return;
					}
					
					if(phytonM.find()) {
						System.out.println("Python");
						return;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
