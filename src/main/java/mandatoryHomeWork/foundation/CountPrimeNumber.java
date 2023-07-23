package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountPrimeNumber {

    @Test
    public void test(){
        Assertions.assertEquals(4,countPrimes(10));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(1,countPrimes(3));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(10,countPrimes(30));
    }

    public int countPrimes(int n) {
        int count=0;
        int prime=0;
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j < n; j++) {
                if(i>=j){
                    if(i%j==0){
                        count++;
                    }
                }
            }
            if(count==2){
                prime++;
            }
            count=0;
        }
        return prime;
    }

}
