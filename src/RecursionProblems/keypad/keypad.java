package RecursionProblems.keypad;

public class keypad {

	static String[] keyPad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	static void keyPad(String s, String ans) {
		// Base Condition
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		char c = s.toCharArray()[0];
		String code = keyPad[c - '0'];
		String ros = s.substring(1);

		for (int i = 0; i < code.length(); i++) {
			keyPad(ros, ans + code.charAt(i));
		}
	}

	public static void main(String[] args) {
		keyPad("23", "");
		System.out.println('c' - '0');
	}
}
