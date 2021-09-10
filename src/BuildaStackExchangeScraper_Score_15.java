import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuildaStackExchangeScraper_Score_15 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(new File("BuildaStackExchangeScraper_Score_15_STC0"))) {
			scanner.findAll("href=\\\"/questions/(\\d+)/.*\\\">(?<=>)(.+)(?=</a)[\\s\\S]+?((?<=relativetime\\\">).+(?=</span>))")
			.forEach(mResult -> {
				System.out.println(
						mResult.group(1) + ";" + 
						mResult.group(2) + ";" +
						mResult.group(3)
				);
			});
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
