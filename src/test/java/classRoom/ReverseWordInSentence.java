package classRoom;

import org.junit.Test;

import java.util.Arrays;

public class ReverseWordInSentence {

    /*
    * String str = "I am happy  engineer";
Reverse the words and not the entire string
*
* 1.initiate two pointer left=0,right=0
* 2.increment right if charAt(right+1) not equal to space
* 3.if right+1 == space store in a temporary variable
* 4.reverse character from left to right until left<right
* 5.once the loop is complete move left and right to the temporary location;
*  */

    @Test
    public void test(){
        System.out.println(reverseWordInSentence("I am happy  engineer"));
    }

    @Test
    public void test1(){
        System.out.println(reverseWordInSentence("I am happy     engineer  "));
    }

    public String reverseWordInSentence(String sentence){
        int left=0,right=0,nextSpace=0;
        char[] charArray = sentence.toCharArray();
        while (right<charArray.length){
            if(Character.isLetterOrDigit(charArray[right])){
                right++;
            }else{
                nextSpace=right;
                right--;
                reverse(charArray,left,right);
                right=nextSpace;
                right++;
                left=right;
            }
        }
        right--;
        reverse(charArray,left,right);
        return String.valueOf(charArray);
    }


    public char[] reverse(char[] a,int start,int end){
        while (start<end){
            char temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return a;
    }
}
