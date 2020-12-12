package UnionOfTwoArrays.Question;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UnionOfTwoArrays {

	public static void main( String[] args ) {
		
		Scanner sc = new Scanner( System.in );

		int t = sc.nextInt();

		while (t-- != 0) {
			Set<Integer> set = new HashSet<>();
			
			int n = sc.nextInt();
			int m = sc.nextInt();

			// This is the array
			int[] a = new int[n];
			int[] b = new int[m];

			for (int i = 0; i < n; i++) set.add(a[i] = sc.nextInt());      
			for (int i = 0; i < m; i++) set.add(b[i] = sc.nextInt());
		
			System.out.println(set.size());
		}

	} 	

}
