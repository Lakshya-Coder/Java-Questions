package RecursionProblems.sorted;

public class sorted {

	static boolean Sorted(int[] a, int n) {

		if (n == 1) {
			return true;
		}

		int[] arr = new int[n - 1];

		for (int i = 1; i < n; i++) {
			arr[i - 1] = a[i];
		}

		boolean restArray = Sorted(arr, n - 1);

		return (a[0] < a[1] && restArray);
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		System.out.println(Sorted(a, a.length));
	}

}
