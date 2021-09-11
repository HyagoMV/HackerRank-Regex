package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HackerRankTweets_Score_15 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(new File("HackerRankTweets_Score_15_STC0"))) {
			System.out.println(scanner.findAll(Pattern.compile("hackerrank.*", Pattern.CASE_INSENSITIVE)).count());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
