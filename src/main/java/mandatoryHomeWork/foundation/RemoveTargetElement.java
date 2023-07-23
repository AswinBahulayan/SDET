package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveTargetElement {

    @Test
    public void test1(){
        Assertions.assertArrayEquals(new int[]{2, 4, 5},removeTargetElement(new int[]{2, 3, 3, 4, 5},3));
    }

    @Test
    public void test2(){
        Assertions.assertArrayEquals(new int[]{},removeTargetElement(new int[]{2, 2},2));
    }

    public int[] removeTargetElement(int[] arr,int target){
        ArrayList<Integer> newListWithTargetElementRemoved=new ArrayList<>();
        for (int each:
             arr) {
            if(each!=target){
                newListWithTargetElementRemoved.add(each);
            }
        }
        int[] newArr=new int[newListWithTargetElementRemoved.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=newListWithTargetElementRemoved.get(i);
        }
        return newArr;
    }
}
