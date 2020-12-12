package RateInMaze;

import java.util.Scanner;

public class Main {

   static boolean isSafe(int[][] arr, int x, int y, int n) {
      if (x < n && y < n && arr[x][y] == 1)
         return true;
      else {
         return false;
      }
   }

   static boolean rateInMaze(int[][] arr, int x, int y, int n, int[][] solArr) {
      if (x == n - 1 && y == n - 1) {
         solArr[x][y] = 1;
         return true;
      }

      if (isSafe(arr, x, y, n)) {
         solArr[x][y] = 1;

         if (rateInMaze(arr, x + 1, y, n, solArr))
            return true;
         if (rateInMaze(arr, x, y + 1, n, solArr)) {
            return true;
         }

         solArr[x][y] = 0; // Backtracking
         return false;
      }

      return false;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[][] arr = new int[n][n];

      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            arr[i][j] = sc.nextInt();
         }
      }

      int[][] soul = new int[n][n];
      System.out.println();

      if (rateInMaze(arr, 0, 0, n, soul))
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
               System.out.print(soul[i][j] + " ");
            System.out.println();
         }
      else {
         System.out.println(false);
      }

      sc.close();
   }

}
