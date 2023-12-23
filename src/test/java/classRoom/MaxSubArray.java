package classRoom;

import org.junit.Test;

public class MaxSubArray {

    /*
    * 1.initiate two pointer left and right as zero
    * 2.increment right in a while loop until kth element
    * and add value at right to a variable sum
    * 3.check if sum is greater than max.
    * 3.if right >k subract element at left and increment left/ add element at right
    * until right less than the array length  */

    public int maxVal(int[] a,int k){
        int left=0,right=0,sum=0,max=Integer.MIN_VALUE;
        /*while(right<k){
            sum+=a[right];
            right++;
            max=Math.max(sum,max);
        }*/
        while(right<a.length){
            sum+=a[right++];
            if(right>k){
            sum-=a[left++];
            }
            max=Math.max(sum,max);
        }
        return max;
    }

    @Test
    public void test(){
        System.out.println(maxVal(new int[]{1,5,2,3,7,1},3));
    }

    @Test
    public void test1(){
        System.out.println(maxVal(new int[]{-1,-5,-2,-3,-7,1},3));
    }
}
