package Homework;

import org.junit.Assert;
import org.junit.Test;

public class SetMismatch {

    /**
     1.input is an array
     2.ouput is an array of length 2. since it only contains the repeated number and the missed number.
     3.testdata:
     =>i/p:[1,2,2,4]
     o/p:[2,3]
     =>i/p:[1,1]
     o/p:[1,2]
     4.Iterate the array find the missing number using a variable
     5.Iterate the array again and find the repeated number using another variable
     6.if missing number is 0 and nums[0] is not equal to 1 then return repeated number,1
     7.if missing number is 0 and num[0] is 1 then return missing number as nums.length
     8.if both above condition are false return repeated number,missing number
     */
    @Test
    public  void test(){
        Assert.assertArrayEquals(new int[]{5,2},findErrorNums(new int[]{3,2,3,4,6,5}));
    }

    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        int j=nums[0];
        int repeatedNum=0;
        int missingNumber=0;
        for (int i=0;i<nums.length;i++) {
            if(i+1<=nums.length-1) {
                if (nums[i] != j && nums[i + 1] != j) {
                    missingNumber = j;
                    break;
                }
            }
            j++;
        }
        for (int i = 0; i < nums.length; i++) {
            repeatedNum=i>0&&nums[i]==nums[i-1]?nums[i]:repeatedNum;
        }
        if(missingNumber==0 && nums[0]!=1) {
            return new int[]{repeatedNum, 1};
        }else if(missingNumber==0 && nums[0]==1){
            return new int[]{repeatedNum, nums.length};
        }else{
            return new int[]{repeatedNum,missingNumber};
        }
    }
}
