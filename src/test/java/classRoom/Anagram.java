package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Anagram {
    /*
    * 1.input is a string
    * 2.output is a string
    * 3.input abbacbba, ab*/

    @Test
    public void test(){
        Assert.assertEquals(true,isAnagram("anagram","nagaram"));
    }

    @Test
    public void test1(){
        Assert.assertEquals(true,isAnagram("rat","car"));
    }

    @Test
    public void test2(){
        Assert.assertEquals(false,isAnagram("a","ab"));
    }
    public boolean isAnagram(String s,String t){
        Map<Character,Integer> map=null;
        if(s.length()>t.length()){
           return false;
        }else{
            map=getMap(t);
            for (int i = 0; i < s.length(); i++) {
                map.remove(s.charAt(i));
            }
        }
        return map.isEmpty();
    }

    public Map<Character,Integer> getMap(String s){
        Map<Character, Integer> map = new ConcurrentHashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        return map;
    }

}
