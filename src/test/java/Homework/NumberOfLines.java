package Homework;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfLines {

    /**
     * https://leetcode.com/problems/number-of-lines-to-write-string/description/
     1.input is a array of integer of length 26 and string
     2.output is array of integer
     3.create a temp variable sum to calculate the sum and row to calculate the row
     4.iterate the given string and get the value of each character from the given array with index as ASCii value of each charcter minus a constant 97.
     5.if sum is greater than 100 the assign sum as the value of current character based on above step and increment the row counter
     6. finally if sum less than or equal to 100 then increment row by 1
     7.return row and sum */
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int row=0;
        for(int i=0;i<s.length();i++){
            sum+=widths[s.charAt(i)-97];
            if(sum>100){
                row++;
                sum=widths[s.charAt(i)-97];
            }
        }
        if(sum<=100){
            row+=1;
        }
        return new int[]{row,sum};
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{3,60},numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{2,4},numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"bbbcccdddaaa"));
    }

}
