package Homework;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RingsOfRods {

    @Test
    public void test() {
        Assert.assertEquals(1, countPoints("B0B6G0R6R0R6G9"));
    }

    /*
    * 1.input is a string
    * 2.output is an integer
    * 3.declare variables
    *  Map<Integer, String> map = new HashMap<>();
    * int i = 0, right = 1, allColors = 0;
    * 4.iterate the given string in multiples of 2 until length
    * 5.if map contains character at right then add the character at right-1 to the existing value
    * 6.else make new entry in map
    * 7.Iterate the map. value contains RGB then increment allColors
    * 8.finally return allcolors*/
    public int countPoints(String rings) {
        Map<Integer, String> map = new HashMap<>();
        char[] charArray = rings.toCharArray();
        int i = 0, right = 1, allColors = 0;
        while (right < charArray.length) {
            if(map.containsKey(Character.getNumericValue(charArray[right]))){
                map.put(Character.getNumericValue(charArray[right]),map.get(Character.getNumericValue(charArray[right]))+charArray[right-1]);
            }else{
                map.put(Character.getNumericValue(charArray[right]),String.valueOf(charArray[right-1]));
            }
            right+=2;
        }
        for (Map.Entry<Integer, String> each :
                map.entrySet()) {
            if (each.getValue().contains("R") && each.getValue().contains("G") &&each.getValue().contains("B")) {
                allColors++;
            }
        }
        return allColors;
    }
}
