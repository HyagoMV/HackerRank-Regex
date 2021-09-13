package medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;


public class DetectTheEmailAddresses_Score_15 {
	static String e = "";
	public static void main(String[] args) {
		try (var scanner = new Scanner(new File("DetectTheEmailAddresses_Score_15_STC1"))) {
			var ts = new TreeSet<String>();
			scanner.findAll(
					"\\w+(?:\\.?\\w*)+@\\w+(?:\\.\\w+)+")
					.forEach(mResult -> ts.add(mResult.group()+";"));
			ts.forEach(email -> e += email);
			System.out.print(e.replaceAll(";$", ""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
