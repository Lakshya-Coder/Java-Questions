package RecursionProblems.PointInGameBoard;

public class Main {
   
   static int countPath(int s, int e) {
      if (s == e) {
         return 1;
      }

      if (s > e) {
         return 0;
      }

      int count = 0;

      for (int i = 1; i <= 6; i++) {
         count += countPath(s + i, e);
      }
      return count;
   }

   public static void main(String[] args) {
      System.out.println(countPath(0, 3));
   }

}
