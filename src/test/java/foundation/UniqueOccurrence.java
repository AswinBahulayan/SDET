package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class UniqueOccurrence {
    @Test
    public void test(){
        Assertions.assertEquals(true,uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    @Test
    public void test1(){
        Assertions.assertEquals(false,uniqueOccurrences(new int[]{1,2}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(true,uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> distinctValuesFromArr = new HashSet<>();
        for (int each :
                arr) {
            distinctValuesFromArr.add(each);
        }
        int count = 0;
        for (int each : distinctValuesFromArr) {
            for (int j = 0; j < arr.length; j++) {
                if (each == arr[j]) {
                    count++;
                }
            }
            map.put(each, count);
            count = 0;
        }
        distinctValuesFromArr.clear();
        for (Map.Entry each :
                map.entrySet()) {
            distinctValuesFromArr.add((int) each.getValue());
        }
        if (map.size() == distinctValuesFromArr.size()) {
            return true;
        } else {
            return false;
        }
    }
}
