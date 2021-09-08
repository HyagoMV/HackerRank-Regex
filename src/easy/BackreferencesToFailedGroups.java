package easy;

import java.util.regex.Pattern;

public class BackreferencesToFailedGroups {

	public static void main(String[] args) {
		var pattern = Pattern.compile(
				"(\\d\\d)(-?)(\\d\\d)\\2(\\d\\d)\\2(\\d\\d)");
		var matcher = pattern.matcher("12-34-56-78-88");
		System.out.println(matcher.find());

	}

}
