package RecursionProblems.subsqe2;

public class subsqe2 {

	static void subsQue(String s, String ans) {
		// Base Condition
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		char c = s.charAt(0);
		int code = c;
		String ros = s.substring(1);

		subsQue(ros, ans);
		subsQue(ros, ans + c);
		subsQue(ros, ans + code);
	}

	public static void main(String[] args) {
		subsQue("AB", "");
	}

}
