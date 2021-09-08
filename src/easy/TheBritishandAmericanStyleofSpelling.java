package easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheBritishandAmericanStyleofSpelling {
	static {
		try {
			System.setIn(new FileInputStream("TheBritishandAmericanStyleofSpelling2"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		var sb = new StringBuilder();
		try (var scanner = new Scanner(System.in)) {
			int lineNumber = Integer.valueOf(scanner.nextLine());
			for (int i = 0; i < lineNumber; i++)
				sb.append(scanner.nextLine() + " ");

			// Discarta a linha que contém o número de linhas
			scanner.nextLine();

			Map<String, Integer> map = new LinkedHashMap<>();

			// Preenchendo o Mapa com as cahves
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				map.put(line.substring(0, line.length() - 2), 0);
			}

			var pattern = Pattern.compile("\\b\\w*[zs]e\\b");
			var matcher = pattern.matcher(sb.toString());

			matcher.results().forEach(result -> {
				String key = result.group().substring(0, result.group().length() - 2);
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + 1);
				}
			});

			map.values().forEach(System.out::println);
		}

	}
}

//