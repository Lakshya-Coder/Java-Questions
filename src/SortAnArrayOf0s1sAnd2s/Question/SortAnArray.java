package SortAnArrayOf0s1sAnd2s.Question;

import java.util.Scanner;
import java.util.Arrays;

public class SortAnArray {
    
    static void sortArray( int[] arr, int n ) {
        int low = 0; 

        int mid = 0; 

        int high = n - 1;

        while ( mid <= high ) {
            switch( arr[mid] ) {
                case 0:
                    swap( arr, low, mid );
                    mid++;
                    low++;
                break;
                case 1:
                    mid++;
                break;
                case 2:
                    swap( arr, mid, high );
                    mid++;
                    high--;
                break;
            }
        }
    }

    static void swap( int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );

        int n = sc.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i < n; i++ ) arr[i] = sc.nextInt();

        sc.close();

        sortArray(arr, n);

        System.out.println( Arrays.toString( arr ) );
    }

}
