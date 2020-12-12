package RecursionProblems.Revomedp;

public class Revomedp {

	static String removeDp(String s) {
		// Base Condition
		if (s.length() == 0) {
			return "";
		}

		char c = s.charAt(0);
		String ans = removeDp(s.substring(1));

		if (ans.length() != 0) {
			if (c == ans.charAt(0)) {
				return ans;
			}
		}

		return c + ans;
	}

	public static void main(String[] args) {
		System.out.println(removeDp("zabardast"));
	}

}