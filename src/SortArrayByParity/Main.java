package SortArrayByParity;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      int[] a = { 3, 1, 2, 4 };
      System.out.println(Arrays.toString(sortArrayByParity(a)));
   }

   static int[] sortArrayByParity(int[] a) {
      // int even = 0;
      // int odd = 0;

      // for (int i = 0; i < a.length; i++) {
      // if (a[i] % 2 == 0)
      // even++;
      // else {
      // odd++;
      // }
      // }

      // int[] even_arr = new int[even];
      // int[] odd_arr = new int[odd];

      // int i = 0;
      // int j = 0;

      // while (i < even && j < a.length) {
      // if (a[j] % 2 == 0) {
      // even_arr[i++] = a[j];
      // }

      // j++;
      // }

      // i = 0;
      // j = 0;
      // while (i < odd && j < a.length) {
      // if (a[j] % 2 != 0) {
      // odd_arr[i++] = a[j];
      // }

      // j++;
      // }

      // for (i = 0; i < even; i++) {
      // a[i] = even_arr[i];
      // }

      // for (i = 0; i < odd; i++) {
      // a[even + i] = odd_arr[i];
      // }

      // return a;
      // int[] ans = new int[a.length];
      // int index = 0;

      // for (int i = 0; i < a.length; i++) {
      // if (a[i] % 2 == 0) {
      // ans[index++] = a[i];
      // }
      // }

      // for (int i = 0; i < a.length; i++) {
      // if (a[i] % 2 == 1) {
      // ans[index++] = a[i];
      // }
      // }

      // return ans;

      int i = 0, j = a.length - 1;

      while (i < j) {
         if (a[i] % 2 > a[j] % 2) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
         }

         if (a[i] % 2 == 0) {
            i++;
         }

         if (a[j] % 2 == 1) {
            j--;
         }
      }

      return a;
   }
}