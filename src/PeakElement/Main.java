package PeakElement;

public class Main {

   static int peakElement(int[] a, int n) {
      int low = 0;
      int high = n - 1;

      while (low <= high) {
         int mid = (low + high) / 2;

         if ((mid == 0 || a[mid] >= a[mid - 1]) && (mid == n - 1 || a[mid] >= a[mid + 1])) {
            return mid;
         } else if (a[mid] <= a[mid + 1]) {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      int arr[] = { 1, 2, 3 };
      System.out.println(peakElement(arr, arr.length));
   }

}
