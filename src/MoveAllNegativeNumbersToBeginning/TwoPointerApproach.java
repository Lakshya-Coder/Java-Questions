package MoveAllNegativeNumbersToBeginning;

public class TwoPointerApproach {
    
    static void shiftall( int[] arr, int left, int right ) {
        while ( left <= right ) {
            if ( arr[left] < 0 && arr[right] < 0 ) left++;

            else if ( arr[left] > 0 && arr[right] < 0 ) {
                swap( arr, left, right );
                left++;
                right--;
            } 

            else if ( arr[left] > 0 && arr[right] > 0 ) right--;

            else {
                left++;
                right--;
            }
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp  = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    static void display( int[] arr, int n ) {
        for ( int i = 0; i < n; i++ ) System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main( String[] args ) {
        int[] arr = { -12, 11, -13, -5, 
            6, -7, 5, -3, 11 };
             
        int arr_size = arr.length;

        shiftall(arr, 0, arr_size - 1);
        display(arr, arr_size - 1);
    }

}
