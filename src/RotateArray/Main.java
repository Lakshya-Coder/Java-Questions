package RotateArray;

public class Main {

   static void rotate(int[] nums, int k) {
      int n = nums.length;
      k = k % n;

      reverse(nums, 0, n - k - 1);
      reverse(nums, n - k, n - 1);
      reverse(nums, 0, n - 1);
   }

   private static void reverse(int[] nums, int low, int high) {
      while (low < high) {
         swap(nums, low, high);
         low++;
         high--;
      }
   }

   private static void swap(int[] nums, int i, int j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
   }

   public static void main(String[] args) {
      int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
      int k = 3;

      rotate(nums, k);

      System.out.println(java.util.Arrays.toString(nums));
   }

}
