package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroes {


    @Test
    public void test(){
        Assertions.assertArrayEquals(new int[]{1,3,12,0,0},moveZeroes(new int[]{0,1,0,3,12}));
    }

    @Test
    public void test2(){
        Assertions.assertArrayEquals(new int[]{0},moveZeroes(new int[]{0}));
    }

    public int[] moveZeroes(int[] nums){
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]==0 && (j+1)<nums.length){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
