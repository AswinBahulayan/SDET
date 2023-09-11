package Homework;

import org.junit.Assert;
import org.junit.Test;

public class FaultyKeyBoard {

    @Test
    public void test(){
        Assert.assertEquals("rtsng",finalString("string"));
    }

    @Test
    public void test2(){
        Assert.assertEquals("ponter",finalString("poiinter"));
    }

    /**
     1.input is a string
     2.output is a string
     3.create a String builder
     4.iterate the string
     5.if the character at ith index is 'i' the reverse the string
     6.else append the string
     7.finally return the appended string */
    public String finalString(String s) {
        StringBuilder string=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                string.reverse();
            }else{
                string.append(s.charAt(i));
            }
        }
        return string.toString();
    }
}
