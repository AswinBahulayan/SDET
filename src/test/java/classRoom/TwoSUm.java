package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class TwoSUm {

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{0,1},twoSum(new int[]{2,7,11,15},9));
    }

    public int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1,sum=0;
        while(right<nums.length){
            sum+=nums[left];
            sum+=nums[right];
            if(sum==target){
                return new int[]{left,right};
            }
            right++;
            if(right==left){
                left++;
                right=nums.length-1;
            }
        }
        return new int[]{-1,-1};
    }
}
