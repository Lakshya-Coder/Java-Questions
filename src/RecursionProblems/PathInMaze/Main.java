package RecursionProblems.PathInMaze;

public class Main {
   
   static int count(int n, int i, int j) {
      if (i == (n-1) && j == (n-1)) {
         return 1;
      }

      if ((i >= n) || (j >= n)) {
         return 0;
      }

      return count(n, i+1, j) + count(n, i, j+1);
   }

   public static void main(String[] args) {
      System.out.println(count(3, 0, 0));
   }

}
