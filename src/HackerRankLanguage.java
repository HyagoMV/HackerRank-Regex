import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HackerRankLanguage {

	static {
		try {
			System.setIn(new FileInputStream("HackerRankLanguage")); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		scanner.nextLine();

		do {
			var pattern = Pattern.compile(
					"([0-9]){4,5}\\s(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP"
					+ "|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK"
					+ "|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY"
					+ "|OBJECTIVEC)");
			var input = scanner.nextLine();
			var matcher = pattern.matcher(input);
			
			if (matcher.matches())
				System.out.println("VALID");
			else
				System.out.println("INVALID");
		} while(scanner.hasNext());
		
		scanner.close();
	}

}
