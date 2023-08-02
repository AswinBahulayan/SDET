package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RomanToInteger {

    /*
    * 1.Add the values of each char in a map
    * 2.Iterate through the given string
    * 3.get the corresponding value for each character from map
    * 3.If map.get(string.char[i]) is less than string[i+1] then subtract value of(i+1)-i and increment value of i
    * 4.Add the subtracted value to a list and return the sum of the items in the list*/

    @Test
    public void test() {
        Assertions.assertEquals(3, romanToInt("IV"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> romanLetterValues = new HashMap<>();
        List<Integer> sum = new ArrayList<>();
        romanLetterValues.put('I', 1);
        romanLetterValues.put('V', 5);
        romanLetterValues.put('X', 10);
        romanLetterValues.put('L', 50);
        romanLetterValues.put('C', 100);
        romanLetterValues.put('D', 500);
        romanLetterValues.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (romanLetterValues.get(s.charAt(i)) < romanLetterValues.get(s.charAt(i + 1))) {
                    sum.add(romanLetterValues.get(s.charAt(i + 1)) - romanLetterValues.get(s.charAt(i)));
                    i = i + 1;
                } else {
                    sum.add(romanLetterValues.get(s.charAt(i)));
                }
            }else{
                sum.add(romanLetterValues.get(s.charAt(i)));
            }
        }
        int romanReigns = 0;
        for (Integer each :
                sum) {
            romanReigns += each;
        }
        return romanReigns;
    }
}
