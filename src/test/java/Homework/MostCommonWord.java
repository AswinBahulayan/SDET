package Homework;

import org.junit.Test;

import java.util.*;

public class MostCommonWord {

    @Test
    public void test(){
        mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"});
    }

    @Test
    public void test1(){
        mostCommonWord("a, a, a, a, b,b,b,c, c",new String[]{"a"});
    }

    /*https://leetcode.com/problems/most-common-word/submissions/*/

    public String mostCommonWord(String paragraph, String[] banned) {
        int max=Integer.MIN_VALUE;
        String mostCommon="";
        paragraph=paragraph.replaceAll("[!?',;.]"," ").toLowerCase();
        String p[]=paragraph.split("\\s");
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        Map<String,Integer> common=new HashMap<>();
        for (String each:
             p) {
            if(!each.isEmpty()) {
                each=each.trim();
                if (common.containsKey(each) && (!set.contains(each))) {
                    common.put(each.trim(), common.get(each) + 1);
                } else if ((!set.contains(each))) {
                    common.put(each, 1);
                }
            }
        }
        for (Map.Entry<String,Integer> each:
             common.entrySet()) {
            if(each.getValue()>max){
                max= each.getValue();
                mostCommon=each.getKey();
            }
        }
        return mostCommon;
    }
}
