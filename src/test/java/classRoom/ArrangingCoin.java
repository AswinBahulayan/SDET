package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class ArrangingCoin {

    /**
     1.input in int
     2.output is int
     3.create a for loop with limit n
     4.use a third variable to store the sum of the iteration
     5.if sum is less than 0 return i-1
     6.if sum is equal to n return i */
    @Test
    public void test(){
        Assert.assertEquals(1,arrangeCoins(1));
    }

    @Test
    public void test1(){
        Assert.assertEquals(1,arrangeCoins(2));
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,arrangeCoins(10));
    }

    public int arrangeCoins(int n) {
//        int n=25;
        int sum=0;//o[1]
        for(int i=1;i<n;i++){//o[n]
            sum+=i;//o[1]
            if(n-sum<0){//o[1]
                return i-1;
            }else if(n==sum){
                return i;
            }
        }
        return 1;
    }
}
