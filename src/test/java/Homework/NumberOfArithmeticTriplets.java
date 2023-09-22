package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberOfArithmeticTriplets {

    @Test
    public void test1(){
        Assert.assertEquals(0,arithmeticTriplets2(new int[]{0,1,7,9},1));
    }
    @Test
    public void test2(){
        Assert.assertEquals(2,arithmeticTriplets2(new int[]{4,5,6,7,8,9},2));
    }
    @Test
    public void test3(){
        Assert.assertEquals(1,arithmeticTriplets2(new int[]{0,1,2},1));
    }

    @Test
    public void test4(){
        Assert.assertEquals(2,arithmeticTriplets2(new int[]{2,10,14,19,20,24,30,34,45,48},10));
    }


    /**
     1.input is an array of integer
     2.output is diff
     3.iterate the array
     4.iterate the nums with initial value as i+1
     5.if difference of element at ith index and jth index is equal to diff make flag as true
     6.if flag is true continue check if element at ith index and jth index is equal to twice the diff the increment count
     7.else make flag to false and break innner look  */
    public int arithmeticTriplets2(int[] nums,int diff){
        int diff2=diff*2,count=0;
        boolean flag=false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(flag){
                    if(nums[j]-nums[i]==diff2){
                        count++;
                    } else if (nums[j]-nums[i]>diff2) {
                        flag=false;
                        break;
                    }
                }
                if(nums[j]-nums[i]==diff){
                    flag=true;
                }
            }
        }
        return count;
    }

}
