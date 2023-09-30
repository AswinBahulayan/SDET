package Homework;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringII {

    @Test
    public void test() {
        Assert.assertEquals("bacdfeg", reverseStr("abcdefg", 2));
    }

    @Test
    public void test1() {
        Assert.assertEquals("bacd", reverseStr("abcd", 2));
    }

    @Test
    public void test2() {
        Assert.assertEquals("gfedcba", reverseStr("abcdefg", 1213));
    }

    @Test
    public void test3() {
        Assert.assertEquals("fdcqkmxwholhytmhafpesaentdvxginrjlyqzyhehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqllgsqddebemjanqcqnfkjmi", reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
    }

    /**
     1.input is string s and integer k
     2.ouput is string
     3.declare variables
     int left=0;
     int right =0;
     char[] arr=s.toCharArray();
     4.iterate the array such that i is incremented in 2k
     5.within the iteration assign left as i
     6.if i+k-1 is less than the length of the string then assign right as i+k-1
     7.else assign right as length-1 of the string
     8.iterate the given array and swap character at left and right using a temp variable until left is less tha right.
     9.finally return the string value of the character array*/

    public String reverseStr(String s, int k) {
      int left=0,right=0;
      char[] charArray = s.toCharArray();
        for (int i = 0; i < s.length(); i+=2*k) {
            left=i;
            right=(i+(k-1))<s.length()-1?i+k-1:s.length()-1;
            while (left<right){
                char temp=charArray[left];
                charArray[left]=charArray[right];
                charArray[right]=temp;
                left++;
                right--;
            }
        }
        return String.valueOf(charArray);
    }

}
