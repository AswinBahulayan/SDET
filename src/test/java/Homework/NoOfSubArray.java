package Homework;

import org.junit.Assert;
import org.junit.Test;

public class NoOfSubArray {

    @Test
    public void test(){
        Assert.assertEquals(3,numOfSubarrays(new int[]{2,2,2,2,5,5,5,8},3,4));
    }

    /**
     * https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/submissions/
     1.input is an array of integer,int k denoting the sub array size and int threshold denoting the expected average
     2.To create the intial window iterate the array until k indexes and add it to sum
     3.check if average is greater than or equal to given thresshold if yes increase count
     4.iterate the array from the window(which is equal to k)
     5.sum the element at index of window and subtract the element at index of window minus k
     6. increment the window and again repeat step 3
     7. finally repeat count.
     8.time complexity is */
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int index=0;//0[1]->space complexity
        int sum=0;
        int window=k;
        int count=0;
        while(index<k){//o[n]->time complexity
            sum+=arr[index++];
        }
        int actualThreshold=sum/k;
        if(actualThreshold>=threshold){
            count++;
        }
        while(window<arr.length){//o[n]-> time complexity
            sum+=arr[window]-(arr[window-k]);
            window++;
            actualThreshold=sum/k;
            if(actualThreshold>=threshold){
                count++;
            }
        }
        return count;
    }
}
