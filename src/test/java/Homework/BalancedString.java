package Homework;

import org.junit.Assert;
import org.junit.Test;

public class BalancedString {

    /**
     1.input is a string
     2.output is a an integer
     3.Variable:
     int counter for char R
     int counter for char L
     int counter to check if R and L is equal
     4.iterate the string
     5.if char at ith index is R increment R counter variable
     6.if char at ith index is L increment L counter variable
     7.if counter R and L are equal increment counter variable
     8.return counter*/
    public int balancedStringSplit(String s) {
        int R=0;
        int L=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R') R++;
            if(s.charAt(i)=='L') L++;
            if(R==L)count++;
        }
        return count;
    }

    @Test
    public void test(){
        Assert.assertEquals(4,balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    public void test1(){
        Assert.assertEquals(2,balancedStringSplit("RLRRRLLRLL"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,balancedStringSplit("LLLLRRRR"));
    }
}
