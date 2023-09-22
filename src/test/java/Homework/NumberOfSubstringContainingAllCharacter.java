package Homework;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubstringContainingAllCharacter {

    @Test
    public void test(){
        System.out.println(numberOfSubstrings("abcabc"));
        Assert.assertEquals(10,numberOfSubstrings("abcabc"));
    }
    /**
     1.input is a string
     2.output is int
     3.declare variable
     int left=0;
     int right=0;
     int subStrings=0;
     int[] alp=new int[3]
     4.iterate the given string until right is less than length of string
     5. add character at right minus 97 and increment right
     6.iterate  a nested loop until all elements inside alp is greater than 0
     7.add the difference of length and right to substring variable*/
    public int numberOfSubstrings(String s) {
        int left=0;
        int right=0;
        int subStrings=0;
        int[] alp=new int[3];
        while(right<s.length()){
            alp[s.charAt(right)-'a']+=1;
            while(alp[0]>0 && alp[1]>0 && alp[2]>0){
                subStrings+=(s.length()-right);
                alp[s.charAt(left)-'a']-=1;
                left++;
            }
            right++;
        }
        return subStrings;
    }
}
