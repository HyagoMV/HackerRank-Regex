import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SayingHi {
	
	static {
		try {
			System.setIn(new FileInputStream("SayingHi")); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		scanner.nextLine();

		do {
			var pattern = Pattern.compile("[Hh][Ii]\\s(?!d|D).*");
			var input = scanner.nextLine();
			var matcher = pattern.matcher(input);
			if (matcher.matches())
				System.out.println(input);
		} while(scanner.hasNext());
		
		scanner.close();
	}

}
