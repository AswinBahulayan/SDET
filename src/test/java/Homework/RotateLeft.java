package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RotateLeft {

    /*
    * 1. input is a list of integer and an integer which denotes
    * number of times the list need to be rotated
    * 2. output is a list of integer which is rotated left
    * TestDate:
    * i/p:[1,2,3,4,5] 2
    * o/p:[3,4,5,1,2]
    * 3.Create a while loop with condition stating the number of rotation is greater than 0
    * 4.decrement the variable in condition for each iteration
    * 5.inside the while loop store the value of first element of the list in a variable
    * 6.iterate the list from 1st index and move it to the previous index
    * using a variable and increment it in each iteration
    * 7.finally place the value of first index in last index which was stored in a variable previously
    * 8.repeat until the while condition becomes false */

    @Test
    public void test(){
        Assert.assertEquals(Arrays.asList(3,4,5,1,2),rotLeft(Arrays.asList(1,2,3,4,5),2));
    }
    /*swap=a.get(0)
    *a.set(0,a.get(j))*/

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        // Write your code here
            while(d>0){
                int swap=a.get(0);
                int k=0;
                for (int i = 1; i < a.size(); i++) {
                    a.set(k,a.get(i));
                    k++;
                }
                a.set(a.size()-1,swap);
                d--;
            }

        return a;
    }
}
