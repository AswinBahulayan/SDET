package Homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    @Test
    public void test() {
        List<Integer> list = partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(list);
    }

    @Test
    public void test1() {
        List<Integer> list = partitionLabels("eccbbbbdec");
        System.out.println(list);
    }

    @Test
    public void test3() {
        List<Integer> list = partitionLabels("eaaaabaaec");
        System.out.println(list);
    }

    @Test
    public void test4() {
        List<Integer> list = partitionLabels("vhaagbqkaq");
        System.out.println(list);
    }

    @Test
    public void test5() {
        List<Integer> list = partitionLabels("qiejxqfnqceocmy");
        System.out.println(list);
    }

    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int[] len = findLastChar(s, 0);
        int lastChar = (len[1] - len[0]) + 1;
        while (len[1] < s.length() - 1) {
            list.add(lastChar);
            len = findLastChar(s, len[1] + 1);
            lastChar = (len[1] - len[0]) + 1;
        }
        list.add(lastChar);
        return list;
    }

    public int[] findLastChar(String s, int start) {
        int[] a = new int[26];
        int[] output = new int[2];
        int limit = s.lastIndexOf(s.charAt(start));
        if (start == limit) return new int[]{start, start};
        for (int i = start; i < limit; i++) {
            a[s.charAt(i) - 'a'] += 1;
        }
        output[0] = start;
        int i = start;
        if (i == s.length() - 1) return new int[]{i, i};
        while (i < s.length() - 1) {
            i++;
            if (a[s.charAt(i) - 'a'] != 0) {
                output[1] = i;
                if (a[s.charAt(i - 1)-'a'] == 0) {
                    a[s.charAt(i - 1)-'a'] += 1;
                }
            }
        }
        return output;
    }
}
