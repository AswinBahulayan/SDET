package classRoom;

import java.util.*;

public class FindOccurenceOfEachNumber {

    public boolean checkOccurence(int[] a){
        Map<Integer,Integer> map=new HashMap<>();
        for (int e:
             a) {
            map.put(e,map.getOrDefault(e,0)+1);
        }
        Collection<Integer> values = map.values();
        Set<Integer> set=new HashSet<>(values);
        return set.size()== map.size();
    }
}
