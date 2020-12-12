package CountSort;

public class Main {

   static void countSort(int[] arr, int n) {
      int k = arr[0];

      for (int i = 0; i < n; i++) {
         k = Math.max(k, arr[i]);
      }

      int count[] = new int[99999999];
      count[0] = 0;

      for (int i = 0; i < n; i++) {
         count[arr[i]]++;
      }

      for (int i = 1; i <= k; i++) {
         count[i] += count[i - 1];
      }

      int[] output = new int[n];
      for (int i = n - 1; i >= 0; i--) {
         output[--count[arr[i]]] = arr[i];
      }

      for (int i = 0; i < n; i++) {
         arr[i] = output[i];
      }
   }

   public static void main(String[] args) {
      int[] arr = { 1, 3, 12, 3, 4, 1, 6, 4, 3 };
      countSort(arr, arr.length);

      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }

      System.out.println();
   }

}
