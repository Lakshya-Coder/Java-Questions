package RecursionProblems.subsque;

public class subsque {

	static void subsQue(String s, String ans) {

		// Base Condition
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		char c = s.charAt(0);
		String ros = s.substring(1);

		subsQue(ros, ans);
		subsQue(ros, ans + c);

	}

	public static void main(String[] args) {
		subsQue("ABC", "");
	}

}
