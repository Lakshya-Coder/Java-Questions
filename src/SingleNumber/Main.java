package SingleNumber;

public class Main {
   static int singleNumber(int[] nums) {
      int n = nums.length;
      int a = 0;
      
      for (int i = 0; i < n; i++) {
          a ^= nums[i];
      }
      
      return a;
   }

  public static void main(String[] args) {
     int[] nums = {2,2,1};

     System.out.println(singleNumber(nums));
  }
}
