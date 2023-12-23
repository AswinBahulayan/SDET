package Homework;

import org.junit.Test;

import java.util.*;

public class UncommonWordFromSentence {

    @Test
    public void test(){
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet","this apple is sour")));
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map=new HashMap<>();
        String[] split = s1.split("\\s");
        List<String> list=new ArrayList<>();
        int i=0;
        String[] split1 = s2.split("\\s");
        for (String e:
             split) {
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for (String e:
             split1) {
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for (Map.Entry<String,Integer> e:
             map.entrySet()) {
            if(e.getValue()==1){
                list.add(e.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}
