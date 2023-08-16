package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlternatingDigitSum {

    @Test
    public void test(){
        Assertions.assertEquals(4,alternateDigitSum(521));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(1,alternateDigitSum(111));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(0,alternateDigitSum(886996));
    }

    /*
    * 1.input is int
    * 2.convert the int to string
    * 3.Iterate using length of the string
    * 4.Convert the char to int and either add or subtract the value based on the index(if the index is odd add else subtract)*/

    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                sum += Character.getNumericValue(s.charAt(i));
            } else {
                sum -= Character.getNumericValue(s.charAt(i));
            }
        }
        if(sum<0){
            sum*=-1;
        }
        return sum;
    }
}
