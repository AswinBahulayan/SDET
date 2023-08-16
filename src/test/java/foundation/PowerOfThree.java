package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfThree {

    @Test
    public void test(){
        Assertions.assertEquals(true,isPowerOfThree(27));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(false,isPowerOfThree(0));
    }

    @Test
    public void test3(){
        Assertions.assertEquals(false,isPowerOfThree(-1));
    }

    public boolean isPowerOfThree(int n) {
        int temp=1;
        if(n==1){
            return true;
        }
        while(temp<n && n%3==0){
            temp*=3;
            if(temp==n){
                return true;
            }
        }
        return false;
    }
}
