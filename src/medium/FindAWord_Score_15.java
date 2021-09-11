package medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FindAWord_Score_15 {

	public static void main(String[] args) {
		try(var scanner = new Scanner(new File("FindAWord_Score_15_TC1"))) {
			var sb = new StringBuilder();
			var num = scanner.nextInt();
			
			scanner.nextLine(); // Clean buffer
			
			for(var i = 0; i < num; i++) 
				sb.append(scanner.nextLine() + " ");
			
			scanner.nextLine(); // Skip num
			
			while (scanner.hasNextLine()) {
				var pattern = Pattern.compile("\\b" + scanner.nextLine() + "\\b");
				var matcher = pattern.matcher(sb);
				
				System.out.println(matcher.results().count());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
