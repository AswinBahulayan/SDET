package Homework;

import org.junit.Assert;
import org.junit.Test;

public class ArrayConcatenationValue {

    @Test
    public void test(){
        Assert.assertEquals(596,findTheArrayConcVal(new int[]{7,52,2,4}));
    }

    @Test
    public void test1(){
        Assert.assertEquals(673,findTheArrayConcVal(new int[]{5,14,13,8,12}));
    }

    /*
    * 1.input is an array of nums
    * 2.output is long
    * 3.declare variable
    *   int left
    *   int right
    *   StringBuilder output
    *   long ans
    * 4.initialise the variable left with 0 and right with length of the array
    * 5.iterate the nums until left is less than half of array length
    * 6.append array of left and right to StringBuilder and increment left and decrement right
    * 7.get the LongValue of append string and store in ans
    * reset stringbuilder and repeat until left less than array.length/2*/
    public long findTheArrayConcVal(int[] nums) {
        int left=0,right=nums.length-1;
        long ans=0;
        StringBuilder output=new StringBuilder();
        while(left<nums.length/2){
            output.append(nums[left]);
            output.append(nums[right]);
            ans+=Long.parseLong(output.toString());
            left++;
            right--;
            output=new StringBuilder();
        }
        if(nums.length%2!=0){
            ans+=nums[(nums.length/2)];
        }
        return ans;
    }
}
