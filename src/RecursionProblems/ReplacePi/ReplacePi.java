package RecursionProblems.ReplacePi;

public class ReplacePi {

	static void replace_pi(String s) {

		// Base Condition
		if (s.length() == 0) {
			return;
		}

		if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			System.out.print(3.14);
			replace_pi(s.substring(2));
		} else {
			System.out.print(s.charAt(0));
			replace_pi(s.substring(1));
		}

	}

	public static void main(String[] args) {
		replace_pi("pippppiiiipi");
	}

}
