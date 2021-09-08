import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPANformat {

	static {
		try {
			// Search project's root directory
			System.setIn(new FileInputStream("ValidPANformat")); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Ignore number of inputs
		scanner.skip("\\d"); 
		
		Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
		
		do {
			Matcher matcher = pattern.matcher(scanner.next());
			
			if (matcher.matches()) 
				System.out.println("YES");
			else
				System.out.println("NO");
		} while(scanner.hasNext());
	}

}
