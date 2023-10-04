package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ThreeNumberWithMaxProduct {

    @Test
    public void test(){
        System.out.println(Arrays.toString(maxProduct(new int[]{3,5,8,1,2,0,6,4},3)));
        Assert.assertArrayEquals(new int[]{5,6,8},maxProduct(new int[]{3,5,8,1,2,0,6,4},3));
    }

    @Test
    public void test1(){
        System.out.println(Arrays.toString(maxProduct(new int[]{-3,-5,-8,1,2,0,-6,4},3)));
        Assert.assertArrayEquals(new int[]{5,6,8},maxProduct(new int[]{3,5,8,1,2,0,6,4},3));
    }

    /*
    * 1.input is an array of integers, and number of elements
    * 2.out is an array of integers with numbers which yields maximum product
    * 3.declare varibles
    *   int left=0,right=0,index=0,max=Integer.MIN_VALUE;
    *  int[] output=new int[numberOfElements]
    * 4.create a loop for the total number of elements to find
    * 5.iterate the given array inside the above loop
    * 6.increment right until it is less that array.length
    * 7.get the product of element of array at left and right
    * 8.check if product is greater than max
    * 9.if yes store value of right at ith index of output array*/

    public int[] maxProduct(int[] a,int k){
        int left=0,right=1,index=0,max=Integer.MIN_VALUE;
        int[] output=new int[k];
        for (int i = 0; i < output.length; i++) {
            while (right<a.length){
                int product=a[left]*a[right];
                if(product > max){
                    max=product;
                    index=right;
                    output[i]=a[left]>a[right]?a[left]:a[right];
                }
                right++;
            }
            a[index]=0;
            right=1;
            max=Integer.MIN_VALUE;
        }
        return output;
    }
}
