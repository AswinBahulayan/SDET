package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleString {

//    public static void main(String[] args) {
//        System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
//    }
    /* 1.Get the input values of int[] and String
     * 2.using for loop to iterate the input array and values
     * 3.Get the character at the indices of i
     * 4.Store it into a string
     * Input __> integer array and string
     * output --> String
     * string temp =""
     * s = "codeleet", indices = [4,5,6,7,0,2,1,3]
     * iterate through codeleet
     * charAt(indices[i])
     * temp=temp + charAt(indices[i])
     * return temp
     */


    @Test
    public void test() {
        Assertions.assertEquals("leetcode", restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

    @Test
    public void test1() {
        Assertions.assertEquals("abc", restoreString("abc", new int[]{0, 1, 2}));
    }

    public static String restoreString(String s, int[] indices) {
//        String temp = "";
        char[] temp=new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            temp[indices[i]] = s.charAt(i);
        }
        return new String(temp);
    }
}
