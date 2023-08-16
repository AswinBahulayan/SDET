package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrangingCoins {


   /* 1.Get the Input value
	 * 2.Using for loop to iterate i should be start with 1 till element the n  consider 1
            *  if(i<balance){
	 * 3. variable balance to be declared n-i  n =10  10-1  = 9
                * 4. variable count++ to increase the completed rows }*/

    @Test
    public void test(){
        Assertions.assertEquals(2,arrangeCoins(5));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(3,arrangeCoins(8));
    }

    @Test
    public void test3(){
        Assertions.assertEquals(1,arrangeCoins(1));
    }

    @Test
    public void test4(){
        Assertions.assertEquals(3,arrangeCoins(6));
    }


    public int arrangeCoins(int n){
        int count=0;
       // 1-6=5 2-5=3 3-3=0 4 5 6
        for (int i = 1; i <=n ; i++) {
            count++;
            n=n-i;

        }
        return count;
    }
}
