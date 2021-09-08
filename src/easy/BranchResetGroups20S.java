package easy;

import java.util.regex.Pattern;

public class BranchResetGroups20S {
	public static void main(String[] args) {
		var pattern = Pattern.compile(
				"(\\d\\d)((---)|(-)|(\\.)|(:))(\\d\\d)\\2(\\d\\d)\\2(\\d\\d)");
		var matcher = pattern.matcher("12-34-56-78---10");
		System.out.println(matcher.matches());

	}
}
