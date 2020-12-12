package RecursionProblems.movex;

public class movex {

	static String moveallx(String s) {
		// Base Condition
		if (s.length() == 0) {
			return "";
		}

		char c = s.charAt(0);
		String ans = moveallx(s.substring(1));

		if (ans.length() != 0) {
			if (c == 'x') {
				return ans + c;
			}
		}

		return c + ans;
	}

	public static void main(String[] args) {
		System.out.println(moveallx("axxboxcefxhix"));
	}

}
