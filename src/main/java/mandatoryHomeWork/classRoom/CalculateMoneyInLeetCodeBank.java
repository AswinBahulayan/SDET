package mandatoryHomeWork.classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateMoneyInLeetCodeBank {

    /*
     * 1.if n is less than 7, then n is 7-n
     * 2.if n is greater than 7 rem=n%7 and n=n/7
     * 3.if rem !=0 then create another for loop to iterate the remaining days */

    @Test
    public void test(){
        Assertions.assertEquals(37,calCulateMoneyInLeetCodeBank(10));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(10,calCulateMoneyInLeetCodeBank(4));
    }

    public int calCulateMoneyInLeetCodeBank(int n) {
        int numOfWeeks = n / 7;
        int rem = n%7;
        if(rem!=0){
            numOfWeeks=numOfWeeks+1;
        }
        int sum = 0;
        int startOfWeek = 1;
        for (int i = 0; i < numOfWeeks; i++) {
            if (rem != 0 && i == numOfWeeks - 1) {
                for (int k = startOfWeek; k <startOfWeek+rem; k++) {
                    sum += k;
                }
            }else{
                for (int j = startOfWeek; j < startOfWeek + 7; j++) {
                    sum += j;
                }
            }
            startOfWeek++;
        }
        return sum;
    }


}
