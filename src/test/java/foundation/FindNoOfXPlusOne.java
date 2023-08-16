package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindNoOfXPlusOne {

    @Test
    public void test1(){
        Assertions.assertEquals(2,findNoOfXPlusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(0,findNoOfXPlusOne(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
    }

    @Test
    public void test3(){
        Assertions.assertEquals(2,findNoOfXPlusOne(new int[]{1, 1, 2}));
    }

    public int findNoOfXPlusOne(int[] arr){
        int count=0;
        int xPlusOne=0;
        for (int i = 0; i <arr.length ; i++) {
            xPlusOne=arr[i]+1;
            for (int j = i+1; j < arr.length; j++) {
                if(xPlusOne==arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
