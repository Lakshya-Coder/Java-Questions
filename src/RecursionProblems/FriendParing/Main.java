package RecursionProblems.FriendParing;

public class Main {

   static int friendsParing(int n) {
      if (n == 0 || n == 1 || n == 2){
         return n;
      }

      return friendsParing(n-1) + friendsParing(n-2) * (n - 1);
   }

   public static void main(String[] args) {
      System.out.println(friendsParing(4));
   }

}
