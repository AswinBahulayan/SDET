package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class CandiesDistribution {

    @Test
    public void test(){
        Assertions.assertEquals(3,candies(new int[]{1,1,2,2,3,3}));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(2,candies(new int[]{1,1,2,3}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(1,candies(new int[]{6,6,6,6}));
    }

    public static int candies(int[] n){
        int length=n.length/2;
        Set<Integer> candies=new HashSet<>();
        for (int each:
                n) {
            candies.add(each);
        }
        if(candies.size()<length){
            return candies.size();
        }
        return length;
    }
}
