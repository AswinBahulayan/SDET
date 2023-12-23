package Homework;

import org.junit.Test;

import java.util.Arrays;

public class MaxSumWithKElements {

    @Test
    public void test(){
//        System.out.println(maximizeSum(new int[]{1,2,3,4,5},3));
        System.out.println(maximizeSum(new int[]{4,4,9,10,10,9,3,8,4,2,5,3,8,6,1,10,4,5,3,2,3,9,5,7,10,4,9,10,1,10,4},3));
    }


    public int maximizeSum(int[] nums, int k) {
        int sum=0,left=0,right= nums.length-1;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[left]<nums[right]){
                right--;
            }else if(nums[right]<nums[left]){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
            } else if (nums[right]==nums[left]) {
                left++;
            }
        }
        while(k>0){
            sum+=nums[nums.length-1];
            nums[nums.length-1]+=1;
            k--;
        }
        return sum;
    }
}
