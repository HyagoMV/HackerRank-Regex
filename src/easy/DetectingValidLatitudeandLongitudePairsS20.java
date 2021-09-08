package easy;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DetectingValidLatitudeandLongitudePairsS20 {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("DetectingValidLatitudeandLongitudePairsS20-STC2"));
			 try(var s = new Scanner(System.in)) {
		           s.nextLine();
		           while(s.hasNextLine()) {
		               var in = s.nextLine();
		               var p = Pattern.compile("\\([-+]?(90(\\.0+)?|[1-8]?\\d(\\.\\d+)?), [-+]?(180(\\.0+)?|1[0-7]\\d(\\.\\d+)?|[1-9]\\d(\\.\\d+)?|\\d(\\.\\d+)?)\\)");
		               var m = p.matcher(in);
		               System.out.println(m.matches() ? "Valid" :"Invalid");
		           }
		       }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
