package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumNumber {

    @Test
    public void test() {
        Assertions.assertEquals(9969, maximum69Number(9669));
    }

    @Test
    public void test1() {
        Assertions.assertEquals(9999, maximum69Number(9996));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(9999, maximum69Number(9999));
    }

    public int maximum69Number(int num) {
        String s = String.valueOf(num);//9699
        char[] chars = s.toCharArray();
        char swap = '0';
        List<Integer> maxNum = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (Character.getNumericValue(chars[i]) < 9) {
                swap = chars[i];
                chars[i] = '9';
                String temp = "";
                for (char each :
                        chars) {
                    temp += each;
                }
                maxNum.add(Integer.parseInt(temp));
                chars[i] = swap;
            }
        }
        if (maxNum.size() > 0) {
            int max = Collections.max(maxNum);
            return max;
        }else{
            return num;
        }
    }
}
