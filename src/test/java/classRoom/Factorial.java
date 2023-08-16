package classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Factorial {

    /*
    * 1.input is int
    * 2.output is int
    * 3.iterate and find the product of 1 to n using a temp variable
    * 4.test data (4,5,10000);
    * 4.return the product*/
    @Test
    public void test(){
        Assertions.assertEquals(24,factorial(99999));
    }

    public long factorial(long n){
        long temp=1;
        for (int i = 1; i <=n; i++) {
            temp*=i;
        }
        return temp;
    }
}
