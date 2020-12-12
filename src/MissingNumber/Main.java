package MissingNumber;

import java.util.Arrays;

public class Main {
   
   static int missingNumber(int[] nums) {
        
      Arrays.sort(nums);
      int n = nums.length;
      
      if (nums[n-1] != n) 
          return n;
      else if (nums[0] != 0) {
          return 0;
      }
      
      for (int i = 1; i < n; i++) {
          int expected_num = nums[i-1]+1;
          
          if (nums[i] != expected_num) {
              return expected_num;
          }
      }
      
      return -1;
  }

  public static void main(String[] args) {
     int[] nums = {3,0,1};

     System.out.println(missingNumber(nums));
  }

}
