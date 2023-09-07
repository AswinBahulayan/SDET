package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class ReverseGivenSentenceMaintainingPositionOfSpecialChar {

    /*
    * 1.input is a string
    * 2.output is a string
    * 3.split the given string and store in an array
    * 4.iterate through the array
    * 5.each element of the array should be converted to a char array
    * 6.iterate the char array from the length until i is greater than or equal to 0
    * 7.if the char at ith index is alphabet append to a string builder and set the value of array at
    * ith index to 0
    * 8.again iterate the array if the value at ith index is zero place the 1st charracter of the reversed
    * string in ith index. continue till length of the array
    * 9.return the value of string of the char array.
    * 10.time complexity is o[n]*/

    @Test
    public void test() {
        Assert.assertEquals("I evo!@#$%L yM yrtnuoC", reverseGivenSentence("I Lov!@#$%e My Country"));
    }


    public String reverseGivenSentence(String s) {
        String[] split = s.split("\\s");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < split.length; i++) {//0[n]
            split[i] = reverseString(split[i]);
            if (i != split.length - 1) {
                output.append(split[i]);
                output.append(" ");
            } else {
                output.append(split[i]);
            }
        }
        return output.toString();
    }

    public String reverseString(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = charArray.length-1; i >= 0; i--) {//o[n]
            if (Character.isAlphabetic(charArray[i])) {
                output.append(charArray[i]);
                charArray[i] = 0;
            }
        }
        String string = output.toString();
        int j = 0;
        for (int i = 0; i < charArray.length; i++) {//o[n]
            if (charArray[i] == 0) {
                charArray[i] = string.charAt(j);
                j++;
            }
        }
        return String.valueOf(charArray);
    }
}
