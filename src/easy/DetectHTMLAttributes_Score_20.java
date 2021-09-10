package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class DetectHTMLAttributes_Score_20 {

	static String  lastKey = "";
	public static void main(String[] args) {
		try (var scanner = new Scanner(new File("DetectHTMLAttributes_Score_20_STC1"))) {
			scanner.nextLine();
			var map = new HashMap<String, TreeSet<String>>();
			scanner.findAll("<(\\w+)|\\s+(\\w+)=").forEach(r -> {
				if (r.group(1) != null) {
					var key = r.group(1);
					if (!map.containsKey(key)) {
						var ts = new TreeSet<String>();
						map.put(key, ts);
					}
					lastKey = key;
				} else {
					var value = r.group(2);
					map.get(lastKey).add(value);
				}			
			});
			
			
			String[]  d= map.toString().replaceAll("=\\[", ":").replaceAll(" ", "").replaceAll("\\{|\\}", "").split("\\],|\\]");
			Arrays.sort(d);
			for (String string : d) {
				System.out.println(string);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	

}
