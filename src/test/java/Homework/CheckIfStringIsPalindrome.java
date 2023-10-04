package Homework;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfStringIsPalindrome {

    @Test
    public void test(){
        Assert.assertEquals(true,isPalindromeWithPointerAtBothEnds("RADAR"));
        System.out.println(isPalindrome(454));
        System.out.println(isPalindrome(454345));
        System.out.println(isPalindrome(4445));
    }

    @Test
    public void test1(){
        Assert.assertEquals(false,isPalindromeWithPointerAtBothEnds("RUDDER"));
    }

    /*
    * 1.input is a string
    * 2.output is boolean
    * 3.create two variables left and right
    * 4.initialize left with 0 and right with length of the string
    * 5.iterate through the string
    * 6.if char at left and right pointer are same continue
    * 7.else break*/
    public boolean isPalindromeWithPointerAtBothEnds(String s){
        int left=0;
        int right=s.length()-1;
        boolean flag=false;
        while(left<s.length()/2){
            flag=s.charAt(left)==s.charAt(right);
            if(!flag)return flag;
            left++;
            right--;
        }
        return flag;
    }

    public boolean isPalindrome(int a){
        int b=0;
        int input=a;
        int rev=0;
        while(a>0){
            b=a%10;
            rev=rev*10+b;
            a=a/10;
        }
        System.out.println(rev+" "+input);
        return input==rev;
    }

    @Test
    public void test2(){
        Assert.assertArrayEquals(new boolean[]{true,false},isSentencePalindrome("RADAR RUDDER"));
        Assert.assertArrayEquals(new boolean[]{true,false,true},isSentencePalindrome("RADAr RUDDER RADAR"));
        Assert.assertArrayEquals(new boolean[]{false},isSentencePalindrome("Test"));
    }


    public boolean[] isSentencePalindrome(String s){
        String[] split = s.split("\\s");
       boolean[] bool=new boolean[split.length];
        for (int i = 0; i < split.length; i++) {
            bool[i]=isPalindromeExpandFromCenter(split[i]);
        }
        return bool;
    }

    /*
     * 1.input is a string
     * 2.output is boolean
     * 3.create two variables left and right
     * 4.initialize left with half the length of string minus 1 and
     *  right should be initialized based on the length string i.e if length of string is odd then right is
     * length/2+1 else length/2
     * 5.iterate through the string
     * 6.if char at left and right pointer are same continue
     * 7.else break*/
    public boolean isPalindromeExpandFromCenter(String s){
        int left=s.length()/2-1;
        int right=0;
        if(s.length()%2==0){
            right=s.length()/2;
        }else {
            right=(s.length()/2)+1;
        }
        boolean flag=false;
        while(left>=0){
            flag=String.valueOf(s.charAt(left)).equalsIgnoreCase(String.valueOf(s.charAt(right)));
            if(!flag)return flag;
            left--;
            right++;
        }
        return flag;
    }


}
