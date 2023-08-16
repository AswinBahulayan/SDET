package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MajorityElement {

    @Test
    public void test() {
       Assertions.assertEquals(3,majorityElement(new int[]{3,2,3}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(2,majorityElement(new int[]{1,1,1,2,2,2,2,5,5}));
    }

    @Test
    public void tes3() {
        Assertions.assertEquals(2,majorityElement(new int[]{2,2,1,1,1,2,2}));
    }


    public int majorityElement(int[] nums){
        Set<Integer> removeDuplicate=new TreeSet<>();
        Map<Integer,Integer> majority=new TreeMap<>();
        int count=0;
        for (int each:
             nums) {
            removeDuplicate.add(each);
        }
        for (Integer each:
             removeDuplicate) {
            for (int i = 0; i < nums.length; i++) {
                if(each==nums[i]){
                    count++;
                }
            }
            majority.put(each,count);
            count=0;
        }
        return Collections.max(majority.entrySet(),Map.Entry.comparingByValue()).getKey();
    }
}
