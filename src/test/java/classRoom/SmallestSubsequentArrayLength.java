package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class SmallestSubsequentArrayLength {

    @Test
    public void test(){
        Assert.assertEquals(3,smallestSubsequentArray(new int[]{1,2,3,4,5},10));
        Assert.assertEquals(-1,smallestSubsequentArray(new int[]{1,1,1,1,1},10));
    }

    /*
    * 1.input is array of integer and an integer
    * 2.output is an int
    * 3.declare variable left,right,sum,count
    * 4.iterate the array until right less than */
    public int smallestSubsequentArray(int[] a,int k){
        int minValue=Integer.MAX_VALUE;
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        while(right<a.length){
            sum+=a[right];
            while(sum>k){
                count=(right+1)-left;
                if(count<minValue){
                    minValue=count;
                }
                sum-=a[left];
                left++;
            }
            right++;
        }
        if(count>0){
            return minValue;
        }else  return -1;
    }
}
