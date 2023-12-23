package classRoom;

import java.util.*;
import java.util.stream.Stream;

public class ArrangeSentence {

    public static void main(String[] args) {
       System.out.println(arrange("The lines are printed in reverse order"));
    }

    public static String arrange(String sentence) {
        sentence=sentence.replaceAll("\\.", "").toLowerCase();
        StringBuilder output=new StringBuilder();
        String[] words=sentence.split("\\s");
//        Set<Integer> set=new TreeSet<>();
        Map<Integer,String> map=new TreeMap<>();
        /*for (String s : words) {
            set.add(s.length());
        }*/
        for (String word : words) {
            if (map.containsKey(word.length())) {
                map.put(word.length(), map.get(word.length()) + " " + word);
            } else {
                map.put(word.length(), word);
            }
        }
        int i=0;

        for (Map.Entry<Integer,String> e:
             map.entrySet()) {
            output.append(e.getValue());
            if(i== map.size()-1)output.append(".");
            output.append(" ");
            i++;
        }
        String out = output.toString().trim();
        StringBuilder result=new StringBuilder();
        for (int j = 0; j < out.length(); j++) {
            if(j==0){
                result.append(Character.toUpperCase(out.charAt(j)));
            }else{
                result.append(out.charAt(j));
            }
        }
        return result.toString();
    }


}
