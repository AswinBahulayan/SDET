package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram {

    @Test
    public void test(){
        Assert.assertEquals(Arrays.asList(0,6),findAnagrams("cbaebabacd","abc"));
    }

    @Test
    public void test1(){
        Assert.assertEquals(Arrays.asList(1),findAnagrams("baa","aa"));
    }

    /**
     * https://leetcode.com/problems/find-all-anagrams-in-a-string/submissions/
     1.input is a pair of string
     2.output is an list of integer
     3.create a integer array of length 26
     4.Declare variables
     int left=0;
     int right=0
     int[] output=new int[26];
     int[] actual=new int[26];
     5.iterate and add value to actual array based on ascii value
     6.iterate the given string s using left and right
     7.increment right until p.length
     8.if right minus left == p.length then check if values in actual and exptected are equal
     9.if yes add to list
     10.then reset the value of expected array
     11.increment left
     12.set value of right to left;
     13.repeat steps until right less than s.length().
     */
    public List<Integer> findAnagrams(String s, String p) {
        int left=0,right=0;
        int[] output=new int[26];
        int[] actual=new int[26];
        for (int i = 0; i < p.length(); i++) {
            actual[p.charAt(i)-'a']+=1;
        }
        List<Integer> out=new ArrayList<>();
        while(right<s.length()){
            output[s.charAt(right)-'a']+=1;
            right++;
            if(right-left==p.length()){
                if(isAnagram(p,output,actual))out.add(left);
                output=new int[26];
                left++;
                right=left;
            }
        }
        return out;
    }

    public boolean isAnagram(String p,int[] output,int[] actual){
        boolean flag=true;
        for(int i=0;i<p.length();i++){
            if(output[p.charAt(i)-'a']!=actual[p.charAt(i)-'a']){
                flag=false;
                return false;
            }
        }
        return flag;
    }
}
