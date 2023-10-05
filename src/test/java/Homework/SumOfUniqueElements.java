package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

    @Test
    public void test(){
        Assert.assertEquals(4,sumOfUnique(new int[]{1,2,3,2}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(0,sumOfUnique(new int[]{1,1,1,1,1}));
    }

    /**
     * https://leetcode.com/problems/sum-of-unique-elements/description/
     1.intput is a array of int
     2.output is int
     3.declare variable
     Map<Integer,Integer>
     int sum
     4.Iterate the given array.if map contains the element in array then increment the value by 1
     5.else assign the value as 1 for the element
     6.Iterate the map. if value is 1 add the key to sum variable
     7. return the sum.
     */
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();//o[n] space complexity
        for (int num : nums) {//o[n]-> time complexity
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for(Map.Entry<Integer,Integer> each:map.entrySet()){//o[n]-> time complexity
            if(each.getValue()==1){
                sum+=each.getKey();
            }
        }
        return sum;
    }
}
