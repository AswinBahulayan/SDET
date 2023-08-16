package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestDigit {

    /*
    * 1.input is String
    * 2.output is integer
    * 3.remove the alphabets from string
    * 4.get all the digits in the string in a treeSet
    * 5.return the second largest number from string
    * */

    @Test
    public void test(){
        Assertions.assertEquals(2,secondHighest("dfa12321afd"));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(-1,secondHighest("abc1111"));
    }

    public int secondHighest(String s) {
        s=s.replaceAll("[a-zA-Z]","");
        Set<Integer> digits=new TreeSet<>();
        for (char each:
             s.toCharArray()) {
            digits.add(Character.getNumericValue(each));
        }
        List<Integer> digit=new ArrayList<>(digits);
        if(digit.size()==1){
            return -1;
        }else{
            return digit.get(digit.size()-2);
        }
    }
}
