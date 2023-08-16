package classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveTragetElement {

    /*
    * 1.input is int[] and element to be removed from array
    * 2.create for loop to add the elements to the set
    * 3.remove the target element from set and convert the set to array and return the value*/
    @Test
    public void test(){
        Assertions.assertArrayEquals(new int[]{2, 4, 5},removeTargetElement(new int[]{2, 3, 3, 4, 5},3));
    }

    public int[] removeTargetElement(int[] arr,int a){
        Set<Integer> set=new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if(set.contains(a)) {
            set.remove(a);
        }else{
            return arr;
        }
        int[] outputArr=new int[set.size()];
        int i=0;
        for (Integer each:
             set) {
            outputArr[i]=each;
            i++;
        }
        return outputArr;
    }
}
