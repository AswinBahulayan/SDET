package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindIfNumberIsPrime {

    @Test
    public void test(){
        Assertions.assertEquals(true,prime(5));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(false,prime(6));
    }

    public boolean prime(int n){
        boolean flag=true;
        for (int i = 2; i <n ; i++) {
            if (n % i == 0) {
                flag=false;
            }
        }
        return flag;
    }
}
