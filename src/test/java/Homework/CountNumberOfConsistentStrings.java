package Homework;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfConsistentStrings {

    @Test
    public void test(){
        Assert.assertEquals(2,countConsistentStrings("ab",new String[]{"ad","bd","aaab","baa","badab"}));
    }

    /**
     * https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
     1.input is a string and string array
     2.output is an integer
     3.declare variables
     boolean[] a=new boolean[26];
     boolean flag=true;
     int sum=0;
     4.iterate the allowed string and set true at each index of the character
     5.iterate each word in the string array
     6.Compare the character of each word with the boolean array using the index
     7.if the value at index is false set the flag to false and break the loop
     8.if flag is true increment sum variable
     9.finally return the sum */
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] a=new boolean[26];//0[n] space complexity
        boolean flag=true;
        int sum=0;
        for(int i=0;i<allowed.length();i++){
            a[allowed.charAt(i)-'a']=true;
        }
        for (String word : words) {//o[n2]-> time complexity
            for (int j = 0; j < word.length(); j++) {
                if (!a[word.charAt(j) - 'a']) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                sum += 1;
            }
            flag=true;
        }
        return sum;
    }
}
