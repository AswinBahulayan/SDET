package Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighestInteger {

    @Test
    public void test() {
        Assertions.assertEquals(94, secondHighestInteger(new int[]{100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89}));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(94, secondHighestIntegerWithOutSet(new int[]{100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89}));
    }

    public int secondHighestInteger(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int[] array = new int[set.size()];
        int i = 0;
        for (Integer each : set) {
            array[i] = each;
            i++;
        }
        return array[array.length - 2];
    }

    public int secondHighestIntegerWithOutSet(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];
    }
}
