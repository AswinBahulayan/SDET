package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class SingleNumber {

    @Test
    public void test1(){
        Assertions.assertEquals(1,singleNumber(new int[]{2,2,1}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(4,singleNumber(new int[]{4,1,2,1,2}));
    }

    @Test
    public void test3(){
        Assertions.assertEquals(1,singleNumber(new int[]{1}));
    }


    public int singleNumber(int[] nums){
        int count=1;
        Map<Integer,Integer> countAndNumber=new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(countAndNumber.containsKey(nums[i])){
                count++;
                countAndNumber.put(nums[i],count);
                count=1;
            }else{
                countAndNumber.put(nums[i],count);
            }
        }
        System.out.println(countAndNumber);
        return Collections.min(countAndNumber.entrySet(),Map.Entry.comparingByValue()).getKey();
    }
}
