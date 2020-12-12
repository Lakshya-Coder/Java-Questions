package FindTheDuplicateNumber;

import java.util.Set;
import java.util.HashSet;

public class ByUsingSet{
	public static void main(String[] args){
		int[] nums={1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}

	static int findDuplicate(int[] nums){
		Set<Integer> seen=new HashSet<Integer>();

		for(int num:nums){
			if(seen.contains(num)){
				return num;
			} 
			seen.add(num);
		}

		return -1;
	}
}