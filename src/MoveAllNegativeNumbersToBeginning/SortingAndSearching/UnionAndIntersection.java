package MoveAllNegativeNumbersToBeginning.SortingAndSearching;

import java.util.Arrays;

public class UnionAndIntersection {
    
    static void printUnion( int[] a, int[] b, int n, int m ) {
        if ( m > n ) {
            int[] temp_arr = a;
            a = b;
            b = temp_arr;

            int temp = n;
            n = m; 
            m = temp;
        }

        Arrays.sort( a );
        
        for ( int i = 0; i < n; i++ )
            System.out.print(a[i] + " ");

        for ( int i = 0; i < m; i++ )
            if ( binarySearch( a, 0, m - 1, b[i] ) == -1 ) 
                System.out.print(b[i] + " ");
    }

    private static int binarySearch( int[] a, int l, int r, int x ) {
        if ( r >= l ) {
            int mid = l + (r - l) / 2;

            if ( a[mid] == x ) return mid; 

            if ( a[mid] > x ) return binarySearch( a, l, mid - 1, x );

            return binarySearch( a, mid + 1, r, x );
        }
        return -1;
    }

    public static void main( String[] args ) {
        int arr1[] = { 7, 1, 5, 2, 3, 6 };
        int arr2[] = { 3, 8, 6, 20, 7 };
        int m = arr1.length;
        int n = arr2.length;
   
        // Function call 
        System.out.println("Union of two arrays is ");
        printUnion(arr1, arr2, m, n);
        System.out.println(">>=*==<<");
    }

}
