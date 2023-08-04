package mandatoryHomeWork.classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class ProductOfArray {

    /**1.Iterate the array
     2.if the product of all number is negative return -1
     3.if the product is positive return 1
     4.if product is 0 return 0*/

    @Test
    public void test(){
        Assertions.assertEquals(-1,arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
    }
    public int arraySign(int[] nums) {
        int product=1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>0){
                product*=1;
            }else if(nums[i]<0){
                product*=-1;
            }else{
                product*=0;
            }
        }
        return product;
    }
}
