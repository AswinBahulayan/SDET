package Homework;

import org.junit.Test;

import java.util.Arrays;

public class MoveZeroes {

    @Test
    public void test(){
        moveZeroes(new int[]{0,1,0,3,12});
    }
    public void moveZeroes(int[] nums) {
        if(nums.length<=1) return;
        int left=0,right=1;
        while(right<nums.length){
            if(nums[left]==0 && nums[right]!=0){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;right++;
            }else if(nums[left]==0 && nums[right]==0){
                right++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
