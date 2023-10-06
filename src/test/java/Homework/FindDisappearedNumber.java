package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FindDisappearedNumber {

    @Test
    public void test(){
        Assert.assertEquals(Arrays.asList(5,6),findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    /**
     1.input is an array of int
     2.output is a list if integer
     3.declare variables
     Set<Integer> set=new HashSet<>();
     List<Integer> set=new ArrayList<>();
     4.add all elements of array to set
     5.iterate the set until array length
     6.try to add the element at each each index to set
     7.if add method returns true add element to list
     8.finally return the list    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int each:nums){
            set.add(each);
        }
        for(int i=1;i<=nums.length;i++){
            if(set.add(i)){
                list.add(i);
            }
        }
        return list;
    }
}
