package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ReverseList<T> {

    @Test
    public void test(){
        Assert.assertEquals(Arrays.asList(5,4,3,2,1),reverseList(Arrays.asList(1,2,3,4,5)));
    }

    /*
    * 1.input is a list
    * 2.output is a list
    * 3.declare two variables left and right with values 0 and list.size()-1
    * 4.if element at index left and right are equal increment left and decrement right
    * 5.if element at index left and right are not equal swap the elements
    * 6.repeat until left is equal or less than list.size()/2*/
    public List<Integer> reverseList(List<Integer> list){
        int left=0;
        int right=list.size()-1;
        while (left<=list.size()/2){//time complexity //o[n/2]
            if((int)list.get(left)== (int)list.get(right)){
                left++;right--;
            }else{
                int swap=list.get(left);
                list.set(left,list.get(right));//space complexity //o[n]
                list.set(right,swap);
                left++;right--;
            }
        }
        return list;
    }
}
