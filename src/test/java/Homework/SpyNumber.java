package Homework;

import org.junit.Assert;
import org.junit.Test;

public class SpyNumber {


/*
1.input is integer
2.output is boolean based on the sum and product of each digits
3.Test data:
I/p:132
O/p:1*3*2=6
1+3+2=6
True
4.declare a int variable to get the last digit of the number
5.divide n/10 until n is 0.
6.Add all digits and find sum, similarly get the product of all digits
7.if sum and product are equal then return true*/

    @Test
    public void test(){
        Assert.assertEquals(true,spyNumber(132));
    }

    @Test
    public void test1(){
        Assert.assertEquals(false,spyNumber(130));
    }

    public boolean spyNumber(int num){
        int lastDigit=0;
        int sum=0;
        int product=1;
        while(num>0){
            lastDigit=num%10;
            sum+=lastDigit;
            product*=lastDigit;
            num=num/10;
        }
        return sum==product;
    }
}
