package Homework;

import org.junit.Assert;
import org.junit.Test;

public class FairyCandy {

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{1,2},fairCandySwap(new int[]{1,1},new int[]{2,2}));
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{5,4},fairCandySwap(new int[]{1,2,5},new int[]{2,4}));
    }


    /**
     * https://leetcode.com/problems/fair-candy-swap/description/
     1.input is a pair of int array of non equal length
     2.output is an int array
     3.Declare variables
     int left=0 ,right=0,sum1=0,sum2=0
     4.iterate the first array against second array
     5.swap elemnt at left of array 1 and right of array 2
     6.find the sum of two array
     7.if sum is equal return array1 at left and array 2 at right
     6. else inremebt right and reset the swapped element and move to next lement*/
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int left=0 ,right=0,sum1=0,sum2=0;
        while(left<aliceSizes.length){
            while (right<bobSizes.length){
                swap(aliceSizes,bobSizes,left,right);
                sum1=sum(aliceSizes);
                sum2=sum(bobSizes);
                if(sum1!=sum2){
                    swap(aliceSizes,bobSizes,left,right);
                    right++;
                }else{
                    return new int[]{bobSizes[right],aliceSizes[left]};
                }
            }
            right=0;
            left++;

        }
        return new int[]{0,0};
    }

    public void swap(int[] aliceSizes,int[] bobSizes,int right,int left){
        int temp=aliceSizes[right];
        aliceSizes[right]=bobSizes[left];
        bobSizes[left]=temp;
    }

    public int sum(int[] a){
        int sum=0;
        for (int each:
                a) {
            sum+=each;
        }
        return sum;
    }
}
