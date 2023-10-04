package Homework;

import java.util.*;

//*https://leetcode.com/problems/destination-city/
// 1.input is a list of list of string
// 2.output is a string
// 3. iterate the given input list of list
// 4. if i is 0 the check if i element of list is present in map
// 5.if yes add 1 to existed value
// 6.else add 1 to value
// 7.if i is 1 then check if the elemnt at 1 is present in map
// 8.if yes add 1 to existing value else add 0
// 9.finally return the key with value 0*/
public class DestinationCity {
    public String destCity(List<List<String>> paths) {
        Map<String,Integer> map=new HashMap<>();
        for(List<String> each: paths){
            int i=0;
            if(i==0){
                if(map.containsKey(each.get(i))){
                    map.put(each.get(i),map.get(each.get(i))+1);
                }else{
                    map.put(each.get(i),1);
                }
                i++;
            }
            if(i==1){
                if(map.containsKey(each.get(i))){
                    map.put(each.get(i),map.get(each.get(i))+1);
                }else{
                    map.put(each.get(i),0);
                }
                //i++;
            }
        }
           /*String output="";
           for(Map.Entry<String,Integer> each:map.entrySet()){
               if(each.getValue()==0){
                   output=each.getKey();
               }
           }*/
        return map.entrySet().stream()
                .filter(entry -> entry.getValue()==0)
                .findFirst().map(Map.Entry::getKey)
                .orElse(null);
    }
}
