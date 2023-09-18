package Homework;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity {

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{2,4,3,1},sortArrayByParity(new int[]{3,1,2,4}));
    }

    /*
    * 1.input is array of integer
    * 2.output is also an array of integer
    * 3.declare two integer variable left and right with value 0 and 1
    * 4.iterate the array
    * 5. if both nums at index left and nums at index right are odd then
    * increment left and right variable by 2
    * 6.if nums at left is odd and nums at right is even then swap and increment left and right
    * 7.if nums at right is even and nums at left is odd indrement left and right
    * 8.if nums at left and right is odd increment right alone
    * 9. repeat above steps until right is less than nums.length*/
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=1;
        while(right<nums.length){
            if(nums[left]%2==0 && nums[right]%2==0){
                left+=2;
                right+=2;
            }else if(nums[left]%2!=0 && nums[right]%2==0){
                nums=swap(nums,left,right);
                left++;right++;
            }else if(nums[left]%2==0 && nums[right]%2!=0){
                left++;right++;
            }else if(nums[left]%2!=0 && nums[right]%2!=0){
                right++;
            }
        }
        return nums;
    }

    public int[] swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
}
