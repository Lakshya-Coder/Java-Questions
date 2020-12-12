package RecursionProblems.PermutationsOfAString;

public class Main {

    static void permutation(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int index = 0; index < s.length(); index++) {
            char fix_char = s.charAt(index);
            String ros = s.substring(0, index) + s.substring(index + 1);

            permutation(ros, ans+fix_char);
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
    }

}
