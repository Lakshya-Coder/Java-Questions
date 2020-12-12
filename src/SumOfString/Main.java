package SumOfString;

import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

      while (t-- != 0) {
         String s = sc.next();

         System.out.println(findSum(s));
      }

      sc.close();
   }

   static int findSum(String s) {
      int sum = 0;
      int length = s.length();
      int num = 0;

      for (int i = 0; i < length; i++) {
         char ch = s.charAt(i);

         if (Character.isDigit(ch))
            num = num*10 + (ch-'0');
         else {
            sum += num;
            num = 0;
         }
      }

      return sum+num;
   }

}
