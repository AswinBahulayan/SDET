package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MissingNumberInArray {

    /*
    * 1.lengthe of the array is N-1
    * 2.arr is not sorted
    * 3.sort the array
    * 4. if the value of i+1 mismatches with arr[i] return i+1*/
    @Test
    public void test1(){
        Assertions.assertEquals(4,missingNumber(5,new int[]{1,2,3,5}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(9,missingNumber(10,new int[]{6,1,2,8,3,4,7,10,5}));
    }

    public int missingNumber(int n,int[] arr){
        Arrays.sort(arr);
        if(n>1)
        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
}
