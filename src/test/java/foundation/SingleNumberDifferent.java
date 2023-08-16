package foundation;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberDifferent {

    public static void main(String[] args) {
        singleNumber(new int[]{2,2,1});
    }

    public static int singleNumber(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i+1];
            }
        }
        return 0;
    }

    public static int candies(int[] n){
        int length=n.length/2;
        Set<Integer> candies=new HashSet<>();
        for (int each:
             n) {
            candies.add(each);
        }
        if(candies.size()<length){
            return candies.size();
        }
        return length;
    }
}
