package classRoom;

import org.junit.Test;

public class MaximumSubarray {

    @Test
    public void test(){
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public int maxSubArray(int[] nums) {
        int max=0,currMax=0,sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i]+sum,nums[i]);
        }
        return sum;
    }
}
