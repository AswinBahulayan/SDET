package mandatoryHomeWork.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeDivisor {

    /*
   *1.Input is int
   2.output is boolean
   3.Delare an int to serve as divisor and find the module of input with it and inrement the variable in each iteration until divisor and input are equal
   4. use an int variable to count the number of divisor
   5.if count is exactly 3 return true else false  */

    @Test
    public void test(){
        Assertions.assertEquals(false,isThree(12));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(true,isThree(4));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(false,isThree(2));
    }

    public boolean isThree(int n) {
        int rem=0;
        int divisor=1;
        int count=0;
        while(divisor<=n){
            rem=n%divisor;
            divisor++;
            if(rem==0){
                count++;
            }
        }
        return count==3;
    }
}
