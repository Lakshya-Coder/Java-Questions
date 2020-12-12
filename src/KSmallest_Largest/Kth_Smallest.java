package KSmallest_Largest;

import java.util.Arrays;



public class Kth_Smallest {


    static int kthSmallest( int[] array, int key ) {
        return kthSmallest( array, 0, array.length - 1, key );
    }

    static int kthSmallest( int[] array, int l ,int r, int key ) {
        
        // If key is smaller than the number elements in the array
        if ( key > 0  && key <= r - l + 1 ) {
            // Partition the array around a random element
            // get position of pivot element in sorted array
            int pos = randomPartition(array, l, r);

            // If positition is same as k
            if ( pos - 1 == key - 1 ) {
                return array[pos];
            }

            // If position is more, recur for left subarray 
            if ( pos - l > key - 1 ) 
                return kthSmallest(array, l, pos-1, key);
                
            // Else recur for right subarray 
            return kthSmallest(array, pos + 1, r, key - pos + l - 1);
        }

        return Integer.MAX_VALUE;

    }

    // Utility method to swap array[i] and array[j]
    static void swap( int[] array, int i, int j ) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int partition( int[] array, int l, int r ) {
        int x = array[r], i = l;

        for ( int j = l; j < r - 1; j++ ) {
            if ( array[j] <= x ) {
                swap( array, i, j );
                i++;
            }
        }

        swap(array, i, r);
        return i;
    }  

    static int randomPartition( int[] array, int l, int r ) {
        int n = r + 1;
        int pivot = ( int ) ( Math.random() ) * ( n - 1 );
        swap(array, l + pivot, r);
        return partition(array, l, r);
    } 

    public static void main(String args[]) { 
        int arr[] = {12, 3, 5, 7, 4, 19, 26}; 
        int k = 3; 
        System.out.println("K'th smallest element is "+ 
        kthSmallest(arr, k)); 

        System.out.println(Arrays.toString(arr));
    } 

}
