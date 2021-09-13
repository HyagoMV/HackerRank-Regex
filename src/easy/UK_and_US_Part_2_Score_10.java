package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UK_and_US_Part_2_Score_10 {
	public static void main(String[] args) {
		try(var scanner = new Scanner(new FileInputStream("UK_and_US_Part_2_Score_10_TC5"))) {
				var sb = new StringBuilder();
				var num = scanner.nextInt();
				
				scanner.nextLine(); // Clean buffer
				
				for(var i = 0; i < num; i++) 
					sb.append(scanner.nextLine() + " ");
				
				scanner.nextLine(); // Skip num
				
				while (scanner.hasNextLine()) 
					System.out.println(Pattern.compile(scanner.nextLine().replace("u", "u?")+"\\b").matcher(sb).results().count());
				
					
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
