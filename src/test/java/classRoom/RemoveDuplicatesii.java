package classRoom;

import org.junit.Test;

public class RemoveDuplicatesii {

    @Test
    public void test(){
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }

    public int removeDuplicates(int[] nums) {
        int size=nums.length,left=0,right=0,count=1;
        while(right<nums.length-1){
            right++;
            if(nums[left]==nums[right]){
                count++;
            }if(count>2){
                count--;
                size--;
            }if(nums[left]!=nums[right]){
                left=right;
                count=1;
            }
        }
        return size;
    }
}
