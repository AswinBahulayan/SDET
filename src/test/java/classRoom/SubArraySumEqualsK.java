package classRoom;

import org.junit.Test;

public class SubArraySumEqualsK {

    @Test
    public void test(){
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }

    @Test
    public void test1(){
        System.out.println(subarraySum(new int[]{1,2,3},3));
    }

    @Test
    public void test2(){
        System.out.println(subarraySum(new int[]{2,0,1,1},2));
    }

    /**
     1.declare two pointer left and right at 0.
     2.increment right and add nums[right] to variable sum
     3.if sum is equal to k then increment count of temp variable
     4.if sum is greater than k then increment left and subtract nums[left] from sum
     5.finally return count */
    public int subarraySum(int[] nums, int k) {
        int left=0,right=0,sum=0,count=0;
        while(right<nums.length && left< nums.length){
           if(sum==k){
               count++;
               left++;right++;
           }
           if(sum<k){
               sum+=nums[right];
               right++;
           }
           if(sum>k){
               left++;
           }
        }
        return count;
    }
}
