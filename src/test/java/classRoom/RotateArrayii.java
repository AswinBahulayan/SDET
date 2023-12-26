package classRoom;

import org.junit.Test;

import java.util.Arrays;

public class RotateArrayii {

    @Test
    public void test(){
        rotate1(new int[]{1,2},3);
    }

    @Test
    public void test1(){
        rotate1(new int[]{1,2,3,4,5,6,7},3);
    }

   /* public void rotate(int[] nums, int k) {
        int right=0;
        int[] out=new int[nums.length];
        while(k>nums.length){
            k=k%nums.length;
        }
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
           out[index++]=nums[i];
        }
        for (int i = 0; i < nums.length-k; i++) {
            out[index++]=nums[i];
        }
       // Arrays.copyOf()
        nums=Arrays.copyOf(out,nums.length);
    }*/

    public void rotate1(int[] nums, int k) {
        if(k>nums.length)k=k%nums.length;
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-k-1);
        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
