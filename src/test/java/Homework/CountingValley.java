package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class CountingValley {

    @Test
    public void test(){
        Assert.assertEquals(1,countingValleys(8,"UDDDUDUU"));
    }

   /*
     * Complete the 'countingValleys' function below.
     *
     * 1.input is a string with characters, D-downhill and U-uphill
     2.output is int with number of valleys
     3.iterate the input string and add -1 if char is D and 1 if character is U to a variable
     4.if the sum of the variable is 0 and character at current iteration is U then add one to a variable which denotes the number of valley.
     5.complete the iteration and return the sum of valley.
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int u = 1;
        int d = -1;
        int valley = 0;
        int count = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'D') {
                count += d;
            } else {
                count += u;
            }
            if(count==0 && path.charAt(i)=='U')valley+=1;
        }
        return  valley;
    }

}
