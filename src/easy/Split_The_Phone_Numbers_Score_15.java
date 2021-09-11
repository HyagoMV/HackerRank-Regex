package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Split_The_Phone_Numbers_Score_15 {
	public static void main(String[] args) {
		try(var scanner = new Scanner(new FileInputStream("Split_The_Phone_Numbers_Score_15_STC0"))) {
			scanner.findAll("(\\d+)[ -](\\d+)[ -](\\d+)")
				.forEach(mr -> System.out.printf("CountryCode=%s,LocalAreaCode=%s,Number=%s%n",mr.group(1), mr.group(2), mr.group(3)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
