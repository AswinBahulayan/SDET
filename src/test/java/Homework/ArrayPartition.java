package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayPartition {

    /**
     1.i/p is an array of even length
     2.o/p : the input is sorted and separated in pairs based on the sorted order and the sum of minimum value from each pair is the output
     3.sort the input array
     4.iterate the array in intervals of two
     5.if nums[i]>nums[i+1] then add nums[i+1] to sum
     6.else add nums[i]  */

    @Test
    public void test(){
        Assert.assertEquals(9,arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]>nums[i+1]){
                sum+=nums[i+1];
            }else{
                sum+=nums[i];
            }
        }
        return sum;
    }
}
