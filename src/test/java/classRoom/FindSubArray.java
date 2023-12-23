package classRoom;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FindSubArray {

    /*
     * in a given array
     * 1,7,4,3,1,2,1,5,1
     * return subarray which */

    /*
    * 1.initiate two pointer left and right with val 0
    * 2.iterate the elements until right less than array length
    * 3.if sum of values from left to right is greater that target increment left
    * 3.else increment right
    * 4.if sum ==target then add all elements from left to right to a list*/

    public List<List<Integer>> findSubArray(int[] a,int target){
        int left=0,right=0,sum=0;
        List<List<Integer>> output=new ArrayList<>();
        List<Integer> subArray=null;
        while(right<a.length){
            if(sum<target){
                sum+=a[right++];
            }else if(sum>target){
                sum-=a[left++];
            }else{
                subArray=new ArrayList<>();
                for(int i=left;i<right;i++){
                    subArray.add(a[i]);
                }
                output.add(subArray);
                sum-=a[left++];
            }
        }
        if(sum==target) {
            subArray = new ArrayList<>();
            for (int i = left; i < right; i++) {
                subArray.add(a[i]);
            }
            output.add(subArray);
        }
        return output;
    }

    @Test
    public  void test(){
        System.out.println(findSubArray(new int[]{1,7,4,3,1,2,1,5,1},7));
    }

    @Test
    public  void test1(){
        System.out.println(findSubArray(new int[]{0,1,3,4,1,2,1},4));
    }
}
