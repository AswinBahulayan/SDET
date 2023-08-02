package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastIndexOfOne {

    /*
    * 1.input is string
    * 2.string only contains 0 and 1
    * 3. if 1 is not present then return -1
    * 4.convert string to charArray
    * 5.iterate through the array until 0 occurs after 1 or until the length
    * 6.capture the index of the 1 using  a counter variable*/

    @Test
    public void test1(){
        Assertions.assertEquals(0,lastIndexOfOne("100"));
    }

    public int lastIndexOfOne(String var){
        char[] chars = var.toCharArray();
        int count=-1;
        for (int i = 0; i < chars.length; i++) {
            if(Character.getNumericValue(chars[i])==1){
                count=i;
            }
        }
       return count;
    }

}
