package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfAllDigitInANumber {

    @Test
    public void test(){
        Assertions.assertEquals(2,sumOfAllDigitInANumber(38));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(0,sumOfAllDigitInANumber(0));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(6,sumOfAllDigitInANumber(42));
    }
    public int sumOfAllDigitInANumber(int n){
        String num = Integer.toString(n);
        int temp=0;
        int i=0;
        while(num.length()>1){
            temp+=Character.getNumericValue(num.charAt(i));
            i++;
            if(i==num.length()){
                i=0;
                num=Integer.toString(temp);
                if(String.valueOf(temp).length()==1){
                    n=temp;
                }
                temp=0;
            }
        }
        return n;

    }
}
