package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPivotIndex {

    /*
    * 1.input: array
    * 2.output : int
    * declare three int variables for pivot index, right sum and left sum
    * create while loop with condition pivotIndex!=arr.length
    * declare for loop for calculating right sum with init value as pivot index+1 and limit less than arr.length and calculate the sum of right elements
    * declare another for loop for calculating left index with init value as 0 and limit less than pivot index and calculate the sum of left elements
    * if sum of left and right elements are equal return pivot index
    * else if pivot index >= arr.length return -1
    * then increment pivot index and reset value for left and right sum variable*/

    @Test
    public void test(){
        Assertions.assertEquals(3,pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(-1,pivotIndex(new int[]{1,2,3}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(0,pivotIndex(new int[]{2,1,-1}));
    }

    public static int pivotIndex(int[] nums) {
        int pivotIndex=0;
        int leftSum=0;
        int rightSum=0;
        while(pivotIndex!=nums.length){
            for (int i = pivotIndex+1; i <nums.length ; i++) {
                rightSum+=nums[i];
            }
            for (int i = 0 ; i <pivotIndex ; i++) {
                leftSum+=nums[i];
            }
            if(leftSum==rightSum){
                return pivotIndex;
            }else if(pivotIndex>=nums.length){
                return -1;
            }
            pivotIndex++;
            rightSum=0;
            leftSum=0;
        }
        return -1;
    }
}
