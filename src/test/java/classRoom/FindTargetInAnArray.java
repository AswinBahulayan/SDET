package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindTargetInAnArray {

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{0,3},findTarget(new int[]{2,3,5,7},9));
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{0,1},findTarget(new int[]{2,3,5,7},5));
    }

    /*
    * {2,3,5,7} 9
    *  i=0 */
    public int[] findTarget(int[] a,int target){
        int startIndex=0;
        int endIndex=a.length-1;
        int sum=0;
       while(startIndex<endIndex){
           sum=a[startIndex]+a[endIndex];
           if(sum==target){
               return new int[]{startIndex,endIndex};
           }else if(sum>target){
               endIndex--;
           } else if (sum<target) {
               startIndex++;
           }
       }
       System.out.println(Arrays.toString(new int[]{startIndex,endIndex}));
       return new int[]{startIndex,endIndex};
    }

}
