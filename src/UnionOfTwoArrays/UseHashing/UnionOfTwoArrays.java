package UnionOfTwoArrays.UseHashing;

import java.util.*;

public class UnionOfTwoArrays {

	static void printUnion(int[] a, int[] b) {
		HashSet <Integer> hs = new HashSet<>();

		for (int i = 0; i < a.length; i++) hs.add(a[i]);

	        for (int i = 0; i < b.length; i++) hs.add(b[i]);

		System.out.println(hs);
	}

	static void printIntersection(int[] a, int[] b) {
		Set <Integer> hs = new HashSet<>();

		for (int i = 0; i < a.length; i++) hs.add(a[i]);

		for (int i = 0; i < b.length; i++) { if (hs.contains(b[i])) { System.out.print(b[i] + " "); } }
	}

	public static void main(String[] args) {
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };
		
		System.out.println("Intersection of two arrays is : ");
		printIntersection(arr1, arr2);

		System.out.println("\nPrint Union function call");
		printUnion(arr1, arr2);
	}
}
