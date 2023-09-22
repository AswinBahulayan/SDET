package Homework;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityII {

    @Test
    public void test(){
        System.out.println();
        Assert.assertArrayEquals(new int[]{4,5,2,7},sortArrayByParityII(new int[]{4,2,5,7}));
    }

    /**
     1.input is array or integer
     2.output is array of integer
     3.declare variables
     int left,int right with value 0 and 1
     4.iterate the array until right and left less than nums.length
     5.is array of left modulo of 2 is equal to zero then increment left by 2
     6.else swap left element with right element and increment right by 2
     7.finally return the sorted array */
    public int[] sortArrayByParityII(int[] nums) {
        int left=0;
        int right=1;
        while(left<nums.length && right<nums.length){
            if(nums[left]%2==0){//o[n]
                left+=2;
            }else{
                nums=swap(nums,left,right);
                right+=2;
            }
        }
        return nums;
    }

    public int[] swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
}
