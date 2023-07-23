package mandatoryHomeWork.foundation;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OccurrenceOfChar {

    public static void main(String[] args) {
        Map<Character, Integer> malayalam = charOccurrence("malayalam");
        for (Map.Entry<Character,Integer> eachChar:
             malayalam.entrySet()) {
            System.out.println(eachChar.getKey()+" "+eachChar.getValue());
        }
    }

    public static Map<Character,Integer> charOccurrence(String a){
        Map<Character,Integer> map=new TreeMap<>();
        int count=0;
        Set<Character> eliminateDuplicate=new TreeSet<>();
        for (int i = 0; i < a.length(); i++) {
            eliminateDuplicate.add(a.charAt(i));
        }
        for (Character eachChar:eliminateDuplicate) {
            for (int j = 0; j < a.length(); j++) {
              if(String.valueOf(eachChar).equalsIgnoreCase(String.valueOf(a.charAt(j)))){
                  count++;
              }
            }
            map.put(eachChar,count);
            count=0;
        }
        return map;
    }
}
