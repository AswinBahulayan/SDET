package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MaximumNumberOfStringPairs {

    /**
     * https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
     1.input is an array of string
     2.output is an integer
     3.get each element in the array and store it in such a way that element is stroed in alphabetical order
     4.Example if string ab then in an array of length 26 char a is stored at index 0 with value as 1 and b is strored in index 1 with value 1.For each corresponding character the index is incremented
     5.finally comapre the array of actual and expected string.if both are same increment count
     6.finally return it */
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(Arrays.toString(getStringAsArr(words[i]))
                        .equals(Arrays.toString(getStringAsArr(words[j])))){
                    count++;
                }
            }
        }
        return count;
    }

    public int[] getStringAsArr(String s){
        int[] alphabets=new int[26];
        for(int i=0;i<2;i++){
            alphabets[s.charAt(i)-'a']+=1;
        }
        return alphabets;
    }

    @Test
    public void test(){
        Assert.assertEquals(2,maximumNumberOfStringPairs(new String[]{"cd","ac","dc","ca","zz"}));
    }

    @Test
    public void test1(){
        Assert.assertEquals(1,maximumNumberOfStringPairs(new String[]{"ab","ba","cc"}));
    }
}
