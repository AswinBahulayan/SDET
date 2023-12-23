package classRoom;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Anagramii {

    /*
    * 1.Check if the length is same else return false
    * 2.if same add first string to map
    * 3.then remove character from second string
    * 4.return if string is empty */

    @Test
    public void test(){
        System.out.println(isAnagram("listen","silent"));
    }

    @Test
    public void test2(){
        System.out.println(isAnagram("listenn","silent"));
    }

    @Test
    public void test3(){
        System.out.println(isAnagram("abcde","fghij"));
    }

    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> map=new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        for (Character e:s1){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for (Character e:
             s2) {
            map.remove(e);
        }
        return map.isEmpty();
    }
}
