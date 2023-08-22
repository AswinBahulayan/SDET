package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LastStoneWeigth {


    /**
     1.input is an array of stones
     2.output: The heaviest stone pairs to be smashed and the difference is added as new element
     Ex: i/p:[2,7,4,1,8,1]
     o/p: 7, 8 are the heaviest so out for the pair is 8-7=1
     the new array becomes
     [2,4,1,1,1]
     3.sort the array
     4.compare arr[i] and arr[i+1] and get the difference
     5.create a separate method to store the new array based on the new size and elements*/

    @Test
    public void test(){
        Assert.assertEquals(1,lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> stonesList=new ArrayList<>();
        for (int each:
             stones) {
            stonesList.add(each);
        }
        while(stonesList.size()>1){
            Collections.sort(stonesList);
            int highest=stonesList.get(stonesList.size()-1);
            int secondhighest=stonesList.get(stonesList.size()-2);
            stonesList.remove(stonesList.size()-1);
            stonesList.remove(stonesList.size()-1);
            stonesList.add(highest-secondhighest);
        }
        return stonesList.get(0);
    }
}
