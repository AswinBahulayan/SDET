package classRoom;

import org.junit.Test;

import java.util.*;

public class GroupAnagram {

    /*
    * 1.iterate the given array
    * 2.iterate the again in a nested loop with inital value from i+1
    * 3.Convert string.get(i) to char array and sort it outside the second loop
    * 4.repeat the same for next string in the list and compare if the arrays string.get(i)
    * and string.get(j) are equal
    * 5.if yes add it to a temp list
    * 6.in end of the second loop add the list to the output list and clear the temporary list
    * 7.finally return the output list*/

    @Test
    public void test(){
//        System.out.println(groupAnagram(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat")));
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
    public List<List<String>> groupAnagram(List<String> string){
        Deque<String> queue=new ArrayDeque<>();
        List<String> list=null;
        List<List<String>> out=new ArrayList<>();
        for (String e:
             string) {
            queue.push(e);
        }
        while(!queue.isEmpty()){
            list=new ArrayList<>();
            String pop = queue.removeFirst();
            char[] charArray = pop.toCharArray();
            Arrays.sort(charArray);
            int count=0;
            list.add(pop);
            while (count<= queue.size()){
                String compare = queue.removeFirst();
                char[] charArray1 = compare.toCharArray();
                Arrays.sort(charArray1);
                if(Arrays.equals(charArray,charArray1)){
                    list.add(compare);
                    count=0;
                }else{
                    queue.addLast(compare);
                }
                count++;
            }
            out.add(list);
        }
        return out;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map=new HashMap<>();
        for(String e:strs){
            char[] a=e.toCharArray();
            Arrays.sort(a);
            String expected=String.valueOf(a);
            ArrayList<String> orDefault = map.getOrDefault(expected, new ArrayList<>());
            orDefault.add(e);
            map.put(expected,orDefault);
        }
        return new ArrayList<>(map.values());
    }
}
