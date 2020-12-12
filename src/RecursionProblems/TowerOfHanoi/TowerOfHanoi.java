package RecursionProblems.TowerOfHanoi;

public class TowerOfHanoi {

	static void towerOfHanoi(int n, char src, char dest, char helper) {

		// Base Condition
		if (n == 0) {
			return;
		}

		towerOfHanoi(n - 1, src, helper, dest);

		System.out.println("Move from " + src + " to " + dest);

		towerOfHanoi(n - 1, helper, dest, src);
	}

	public static void main(String[] args) {

		towerOfHanoi(3, 'A', 'C', 'B');

	}

}