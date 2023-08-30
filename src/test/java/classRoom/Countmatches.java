package classRoom;

import java.util.*;

public class Countmatches {

    public static void main(String[] args) {
        List<String> list1= Arrays.asList("phone","blue","pixel");
        List<String> list2= Arrays.asList("computer","silver","lenovo");
        List<String> list3= Arrays.asList("phone","gold","iphone");
        List<List<String>> list=new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(countMatches(list,"color","silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String,Integer> rule=new HashMap<>();
        rule.put("type",0);
        rule.put("color",1);
        rule.put("name",2);
        int count=0;
        for (List<String> item : items) {
            if (item.get(rule.get(ruleKey)).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

}
