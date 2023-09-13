package Homework;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNumberHasEqualDigitAndDigitValue {

    /**
     * https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
     1.input is string containing only digits
     2.output is boolean
     3.create an integer array of length 10
     4.iterate the given array
     5.get each character and store it in the array as per the ascii order as index
     6.iterate the int array and append the value at each index and compare it with input
     7.if input is same as the output string return true else false*/
    public boolean digitCount(String num) {
        StringBuilder output=new StringBuilder();
        int[] arr=new int[10];
        for(int i=0;i<num.length();i++){
            arr[num.charAt(i)-48]+=1;
        }
        for(int i=0;i<num.length();i++){
            System.out.println(i+" "+arr[i]);
            output.append(arr[i]);
        }
        return output.toString().equals(num);
    }

    @Test
    public void test(){
        Assert.assertEquals(true,digitCount("1210"));
    }

    @Test
    public void test1(){
        Assert.assertEquals(false,digitCount("030"));
    }
}
