import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ForwardReferences20S {
	static {
		try {
			System.setIn(new FileInputStream("ForwardReferences"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (var scanner = new Scanner(System.in)) {
			var pattern = Pattern.compile("(\\2tic|(tac))+");
			while (scanner.hasNextLine()) {
				var matcher = pattern.matcher(scanner.nextLine());
				System.out.println(matcher.matches());
			}
		}
	}
}
