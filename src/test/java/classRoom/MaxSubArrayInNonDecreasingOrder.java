package classRoom;

import org.junit.Test;

import java.util.Arrays;

public class MaxSubArrayInNonDecreasingOrder {

    @Test
    public void test(){
        System.out.println(maxSubArrayLength(new int[]{7,4,6,12,14,14,3}));
        System.out.println(maxSubArrayLength(new int[]{1,3,5,4,7}));
        System.out.println(maxSubArrayLength(new int[]{2,4,3,5,0,7,11}));
    }

    /*
    * 1.iniate a two pointer left at 0 and right at 1
    * 2.increment the pointer at each iteration
    * 3.if a[left] is less than a[right] increment currlen
    * 4.if not assign currlen to maxlen and reset currlen*/
    public int maxSubArrayLength(int[] a){
        int left=0,right=1,currLen=1,maxLen=Integer.MIN_VALUE;
        while(right<a.length){
            if(a[left]<a[right]){
                currLen++;
            }else{
                if(currLen>maxLen){
                    maxLen=currLen;
                }
                currLen=1;
            }
            left++;
            right++;
        }
        if(currLen>maxLen){
            maxLen=currLen;
        }
        return maxLen;
    }
}
