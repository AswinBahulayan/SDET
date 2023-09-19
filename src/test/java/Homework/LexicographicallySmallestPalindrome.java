package Homework;

import org.junit.Assert;
import org.junit.Test;

public class LexicographicallySmallestPalindrome {

    @Test
    public void test(){
        Assert.assertEquals("efcfe",makeSmallestPalindrome("egcfe"));
    }

    /**
     * https://leetcode.com/problems/lexicographically-smallest-palindrome/submissions/
     1.input is a string
     2.output is a string
     3.declare variable left and right with value 0 and s.length()-1;
     4.iterate the given array in a while loop
     5. iterate until left is < than s.length()/2
     6. check if character at index left and right are equal if yes inrement left and decrement right
     7. if not than compare both character and replace character at left or right with the character with lesser ascii value
     8.increment left and decrement right
     9.return the output string
     10.space complexity is o[n]
     11.time complexity is o[n/2]*/
    public String makeSmallestPalindrome(String s) {
        char[] chars=s.toCharArray();//o[n]->space complexity
        int left=0;//o[1]-space complexity
        int right=chars.length-1;//o[1]-space complexity
        while(left<(chars.length/2)){//o[n/2]->time complexity
            if(chars[left]==chars[right]){
                left++;
                right--;
            }else if(chars[left]>chars[right]){
                chars[left]=chars[right];
                left++;
                right--;
            }else{
                chars[right]=chars[left];
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }
}
