package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubString {

    @Test
    public void test(){
        Assert.assertEquals(3,lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test1(){
        Assert.assertEquals(1,lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(3,lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test3(){
        Assert.assertEquals(3,lengthOfLongestSubstring("dvdf"));
    }

    /*https://leetcode.com/problems/longest-substring-without-repeating-characters/description/*/
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())return 0;
        int left=0,right=0,count=0;
        int[] output=new int[256];
        int maxL=Integer.MIN_VALUE;
        while(right<s.length()){
            if(output[s.charAt(right)]==0) {
                output[s.charAt(right)]+=1;
                right++;
            }else {
                count=right-left;
                if(count>maxL){
                    maxL=count;
                }
                output[s.charAt(left)]-=1;
                left++;
            }
        }
        count=right-left;
        if(count>maxL){
            maxL=count;
        }
        return maxL;
    }
}
