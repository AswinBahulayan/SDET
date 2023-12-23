package classRoom;

import org.junit.Test;

public class MaxConsecutiveOnes {

    @Test
    public void test(){
//        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3));
    }

    /*
    * if element is 1 increment right
    * else if element is 0 decrement k and increment right
    * if k==0 store value of right-left, make left=right, reset k*/
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,maxLen=1,currLen=1,count=k;
        while(right<nums.length-1){
            if(nums[right]!=1){
                count--;
            }
            if(count==0 && nums[left]==1){
                currLen=right-left;
                if(currLen>maxLen){
                    maxLen=currLen;
                }
                left=right;
            }else if(count==0 && nums[left]==0){
                currLen=right-left;
                if(currLen>maxLen){
                    maxLen=currLen;
                }
                while(nums[left]==0){
                    count++;
                    left++;
                }
            }
            right++;
        }
        currLen=right-left;
        if(currLen>maxLen){
            maxLen=currLen;
        }
        return maxLen+1;
    }
}
