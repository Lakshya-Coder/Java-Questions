package RecursionProblems.ReverseString;

public class ReverseString {

	static void reverse(String s) {

		// Base Condition
		if (s.length() == 0) {
			return;
		}

		String restString = s.substring(1);
		reverse(restString);

		System.out.print(s.charAt(0));
	}

	public static void main(String[] args) {
		reverse("binod");
	}

}