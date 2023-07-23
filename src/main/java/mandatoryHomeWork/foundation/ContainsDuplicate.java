package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicate {

    @Test
    public void test1(){
        Assertions.assertEquals(true,containsDuplicate(new int[]{1,2,3,1}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(false,containsDuplicate(new int[]{1,2,3,4}));
    }

    @Test
    public void test3(){
        Assertions.assertEquals(true,containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public boolean containsDuplicate(int[] nums){
        boolean flag=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return flag;
    }
}
