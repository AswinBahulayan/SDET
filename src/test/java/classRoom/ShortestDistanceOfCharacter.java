package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ShortestDistanceOfCharacter {

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{3,2,1,0,1,0,0,1,2,2,1,0},shortestToChar("loveleetcode",'e'));
    }

    /*
    * https://leetcode.com/problems/shortest-distance-to-a-character/submissions/
     1.input is a string and char
    2.output is an array of integer
    3.declare variables
        int left=0;
        int right=0;
        int[] output=new int[s.length];
        int countLeft=0;
        int countRight=0;
    4.iterate the given array from 0 to s.length-1
    5.initialize right and left as the value of i from step 4
    6. increment right/countRight until character at right is equal to c
    7.decrement left/countLeft until character at left is equal to c
    8.assign the values at ith index as min value between countleft,countRight
    9.reset value of countRight/countLeft to 0
    10.repeat until the end of the iteration*/
    public  int[] shortestToChar(String s, char c) {
      int left =0,right=0,countLeft=0,countRight=0;
      int[] output=new int[s.length()];//o[n]-space complexity
        for (int i = 0; i < s.length(); i++) {//0[n^2]-time complexity
            right=i;
            while(s.charAt(right)!=c && right!=s.length()-1){
                right++;
                countRight++;
            }
            left=i;
            while(s.charAt(left)!=c && left-1>=0){
                left--;
                countLeft++;
            }
            output[i]=s.charAt(left)!=c && s.charAt(right)==c?countRight
                    :(s.charAt(left)==c && s.charAt(right)!=c?countLeft:(s.charAt(left)==c && s.charAt(right)==c)
                    ?Math.min(countLeft,countRight):0);
            countRight=0;
            countLeft=0;
        }
        return output;
    }
}
