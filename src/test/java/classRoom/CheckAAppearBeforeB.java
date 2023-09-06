package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class CheckAAppearBeforeB {

    @Test
    public void test(){
        Assert.assertEquals(false,checkString("abab"));
    }
    /**
     1.input is a String
     2.output is boolean
     3.if string contains a ba return false
     4.else return true*/
    public boolean checkString(String s) {
        if(s.contains("ba")) {
            return false;
        }else{
            return true;
        }
    }
}
