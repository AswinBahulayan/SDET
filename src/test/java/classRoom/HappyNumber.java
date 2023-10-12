package classRoom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {

    //https://leetcode.com/problems/happy-number/description/

   /* public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<Integer>();
        int sum=0;
        int product=1;
        String s = String.valueOf(n);
        List<Integer> list=new ArrayList<>();
//        list.contains()
//        while(set.add(s)) {
            for (int i = 0; i < s.length(); i++) {
                sum += square(Character.getNumericValue(s.charAt(i)));
            }
            s=String.valueOf(sum);
        }
    }*/

    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            list.add(i);
        }
        for(int i=0;i<=nums.length;i++){
            if(list.contains(nums[i])){
                list.remove(nums[i]);
            }
        }
        return list;
    }

    public int square(int a){
        return a*a;
    }
}
