package mandatoryHomeWork.classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DuckNumber {

    /*
    * 1.input is integer
    * 2.output is boolean
    * 3.Iterate the given number until the number is zero by assigning the modulo of 10 by itself
    * 4.if modulo of 10 is zero in first iteration or before the last iteration return true
    * 5.Else return false */

    @Test
    public void test(){
        Assertions.assertEquals(true,duckNumber(7770));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(false,duckNumber(07770));
    }

    public boolean duckNumber(int num){
        int rem=0;
        int rev=0;
        int count=0;
        List<Integer> digits=new ArrayList<>();
        while (num!=0){
            rem=num%10;
            digits.add(rem);
            num=num/10;
        }
       return digits.contains(0) && digits.indexOf(0)!=digits.size()-1;
    }
}
