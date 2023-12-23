package classRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanToInteger {

    /*
    * 1.add char to map with respective values
    * 2.iterate the give string
    * 3.if value of character at i is less than character at i+1 then subtract value of
    * i+1 -(i)
    * 4.else directly add value of i to list of sum
    * 5.finally add values stored in list and return it*/
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

    public int romanToInt2(String s) {
        int[] a=new int[26];
        int sum=0;
        a['I'-'A']=1;
        a['V'-'A']=5;
        a['X'-'A']=10;
        a['L'-'A']=50;
        a['C'-'A']=100;
        a['D'-'A']=500;
        a['M'-'A']=1000;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (a[s.charAt(i)-'A'] < a[s.charAt(i+1)-'A']) {
                    sum+=a[s.charAt(i+1)-'A']- a[s.charAt(i)-'A'];
                    i = i + 1;
                } else {
                    sum+=a[s.charAt(i)-'A'];
                }
            }else{
                sum+=a[s.charAt(i)-'A'];
            }
        }
        return sum;
    }
}
