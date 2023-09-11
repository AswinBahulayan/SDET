package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class HeightChecker {

    @Test
    public void test(){
        Assert.assertEquals(3,heightChecker(new int[]{1,1,4,2,1,3}));
    }

    @Test
    public void test2(){
        Assert.assertEquals(5,heightChecker(new int[]{5,1,2,3,4}));
    }


    /**
     1.input is an array
     2.o/p is int
     3.get the copy of input array in a temp array
     4.sort the input array
     5.iterate the array and compare each index of temp and input
     6.if value at ith index doesnt match then increment a count variable
     7.return the count */
    public int heightChecker(int[] heights) {
        int[] actual=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(actual[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
