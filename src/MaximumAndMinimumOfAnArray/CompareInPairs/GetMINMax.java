package MaximumAndMinimumOfAnArray.CompareInPairs;

public class GetMINMax {
    static class Pair {
 
        int min;
        int max;
    }
 
    static Pair getMinMax( int array[], int n ) {
        Pair min_max = new Pair();
        int i;

        /* If array has even number element then
        initialize the first two elements as minimum and
        maximum */
        if ( n % 2 == 0 ) {
            if ( array[0] > array[1] ) {
                min_max.max = array[0];
                min_max.min = array[1];
            } else {
                min_max.min = array[0];
                min_max.max = array[1];
            }
            i = 2;
            /* Set the starting index for loop */
        } /* If array has odd number of elements then
        initialize the first element as minmum and 
        maximus */ else {
            min_max.max = array[0];
            min_max.min = array[0];
            i = 1;
            /* Set the starting index for loop */
        }   

        /* In the while loop, pick elements in pair and 
        compare the pair with max and min so far */
        while ( i < n - 1 ) {
            if ( array[i] > array[i + 1] ) {
                if ( array[i] > min_max.max ) min_max.max = array[i];

                if ( array[i + 1] < min_max.min ) min_max.min = array[i + 1];
            } else {
                if ( array[i + 1] > min_max.max ) min_max.max = array[i + 1];

                if ( array[i] < min_max.min ) min_max.min = array[i];
            }

            i += 2;
            /* Increment the index by 2 as two
                elements are processed in loop */
        }

        return min_max;
    }
 
    /* Driver program to test above function */
    public static void main( String args[] ) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax( arr, arr_size );
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
 
    } 
}
