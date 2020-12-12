package WriteAProgramToReverseAnArrayOrString.RecursiveWay;

import java.util.Scanner;

public class ReverseArray {
    
    static void reverseArray( int[] array, int start, int end ) {
        if ( start >= end ) return;

        swap( array, start, end );
        reverseArray(array, start + 1, end - 1);
    }

    static void swap( int[] array, int i, int j ) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static void printArray( int[] array, int n ) {
        for ( int i = 0; i < n; i++ )   System.out.print(array[i] + " "); 

        System.out.println();
    }

    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );

        int n = sc.nextInt();
        int[] array = new int[n];

        for ( int i = 0; i < n; i++ )   array[i] = sc.nextInt();

        sc.close();

        System.out.println("\nThis is array");

        printArray( array, n );

        int start = 0, end = array.length - 1;

        reverseArray( array, start, end );

        System.out.println( "\nReversed array is" );
        printArray( array, n );

    }
}
