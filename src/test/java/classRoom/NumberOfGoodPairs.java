package classRoom;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int left=0,right=1,count=0;
        while(left<nums.length-2){
            if(nums[left]==nums[right]){
                count++;
            }
            if(right==nums.length-1){
                left++;
                right=left+1;
            }
            right++;
        }
        return count;
    }


}
