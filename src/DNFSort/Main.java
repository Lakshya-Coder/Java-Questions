package DNFSort;

public class Main {

   static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }

   static void dnfSort(int[] arr, int n) {
      int low = 0;
      int mid = 0;
      int high = n - 1;

      while (mid <= high) {
         if (arr[mid] == 0) {
            System.out.println("0 " + mid);
            swap(arr, low, mid);
            low++;
            mid++;
         }

         if (arr[mid] == 1) {
            System.out.println("1 " + mid);
            mid++;
         }
         if (arr[mid] == 2) {
            System.out.println("2 " + mid);
            swap(arr, mid, high);
            high--;
         }

      }

   }

   public static void main(String[] args) {
      int[] arr = { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 2 };

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      System.out.println();

      dnfSort(arr, arr.length);

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
   }
}
