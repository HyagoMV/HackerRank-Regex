import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindHackerRank {

	static {
		try {
			System.setIn(new FileInputStream("FindHackerRank"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		scanner.nextLine();

		do {
			String input = scanner.nextLine();
			if (input.matches("^hackerrank$")) {
				System.out.println("0");
				continue;
			}
			if (input.matches("^hackerrank.*")) {
				System.out.println("1");
				continue;
			}
			if (input.matches(".*hackerrank$")) {
				System.out.println("2");
				continue;
			}
			System.out.println(-1);
		} while (scanner.hasNext());

		scanner.close();
	}

}
