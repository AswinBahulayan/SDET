package Homework;

import org.junit.Assert;
import org.junit.Test;

public class DistinctCharacter {

    @Test
    public void test(){
        Assert.assertEquals(1,countGoodSubstrings("xyzzaz"));
    }

    /**
     1.input is a string
     2.output is an integer
     3.initiate a variable for slider with 2 indicating the 3index of given string
     4.initiate a variable to count the max valid string
     5.iterate the given string.
     6.get substring of given string with start index as slider plus 1 minus 3 and end index as slider plus as the end index is exclusive
     7.check if substring has non repeating character. if yes increment counter.
     8.increment the slider variable untile slider is less than length of given string
     9.iterate the given string
     10.time complexity is o[n] */
    public int countGoodSubstrings(String s) {
        int slider=2;
        int count=0;
        while(slider<s.length()){//o[n]
            int start=(slider+1)-3;
            int end=slider+1;
            if(isGoodString(s.substring(start,end))){
                count++;
            }
            slider++;
        }
        return count;
    }

    public boolean isGoodString(String s){
        if(s.charAt(0)!=s.charAt(1) && s.charAt(0)!=s.charAt(2) && s.charAt(1)!=s.charAt(2)){
            return true;
        }
        return false;
    }
}
