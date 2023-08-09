package mandatoryHomeWork.classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuzzNumber {

    /*1.the input is int
    * 2.the output is a boolean
    * 3.test data can be 35,107,7
    * 3.Check if the given num is divisible by 7(n%7)
    * 4.Else check if the num is ending with 7(n%10)
    * 5.any of the above cases are true return true else false*/

    @Test
    public void test(){
        Assertions.assertEquals(true,buzzNumber(-37));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(true,buzzNumber(-35));
    }
    @Test
    public void test2(){
        Assertions.assertEquals(false,buzzNumber(-104));
    }

    public boolean buzzNumber(int n){
        if(n==0){
            return false;
        }
        int divisibleBySeven=0;
        int reminderOfTen=0;
        divisibleBySeven=n%7;
        reminderOfTen=n%10;
        return divisibleBySeven == 0 || reminderOfTen == 7;
    }
}
