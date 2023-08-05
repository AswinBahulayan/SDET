package mandatoryHomeWork.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighestInteger {

    @Test
    public void test(){
        Assertions.assertEquals(94,secondHighestInteger(new int[]{100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89}));
    }

    public int secondHighestInteger(int[] arr){
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
       int[] array=new int[set.size()];
        int i=0;
        for(Integer each:set){
            array[i]=each;
            i++;
        }
        return array[array.length-2];
    }
}
