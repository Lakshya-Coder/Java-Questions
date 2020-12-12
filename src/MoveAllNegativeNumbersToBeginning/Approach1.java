package MoveAllNegativeNumbersToBeginning;

import java.util.Scanner;

public class Approach1 {
    
    static void rearrange( int[] arr, int n ) {
        int j = 0; // j is the pointer which help the to swaping

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) swap(arr, i, j);
                
                j++;
            }
        }
    }

    static void swap( int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray( int[] arr, int n ) {
        for ( int i = 0; i < n; i++ ) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int[] arr = new int[n];

        for ( int i = 0; i < n; i++ ) arr[i] = sc.nextInt();

        sc.close();

        rearrange(arr, n);
        printArray(arr, n);
    }

}
