package medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Detect_The_Domain_Name_Score_15 {

	public static void main(String[] args) {
		try(var scanner = new Scanner(new File("DetectTheDomainName_Score_15_TC2"))){
			var set = new TreeSet<String>();
			scanner.findAll("(?<=http[s]?://)(?:ww[w\\d]\\.)?([\\p{Alnum}-]+\\.(?:[\\p{Alnum}-]\\.?)+)")
				.forEach(mResult -> set.add(mResult.group(1)));
			System.out.println(set.toString().replaceAll("\\[|\\]|\\s", "").replaceAll(",", ";"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
