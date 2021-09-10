package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BuildingaSmartIDE_Identifyingcomments_Score_15 {

	public static void main(String[] args) {
		try (var scanner = new Scanner(new File("BuildingaSmartIDE_Identifyingcomments_Score_15_TC4"))) {
			scanner.findAll("//.*|/\\*[\\s\\S]*?\\*/")
				.forEach(result -> {
					System.out.println(result.group().replaceAll("(?<!\\w)\s{2,}(?=\\w|\\*/)", ""));
				});
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

}
