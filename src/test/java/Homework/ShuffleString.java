package Homework;

import org.junit.Assert;
import org.junit.Test;

public class ShuffleString {

    /**
     1.input is a string and an array of indices
     2.output is a string which is shuffles based on the input array provided
     3.create a char array and and iterate through the string
     4.Stroe the char at ith position at ith position of the input array provided
     4.return the value of the new array created */
    public String restoreString(String s, int[] indices) {
        String temp="";
        char[] chararr=new char[s.length()];
        for(int j=0;j<indices.length;j++){
            chararr[indices[j]]=s.charAt(j);
        }
        return String.valueOf(chararr);
    }


    @Test
    public void test(){
        Assert.assertEquals("leetcode",restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
    }

    @Test
    public void test2(){
        Assert.assertEquals("abc",restoreString("abc",new int[]{0,1,2}));
    }

}
