package Homework;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    @Test
    public void test(){
        System.out.println(firstUniqChar("leetcode"));
    }

    @Test
    public void test1(){
        System.out.println(firstUniqChar("loveleetcode"));
    }

    @Test
    public void test2(){
        System.out.println(firstUniqChar("aabb"));
    }

    @Test
    public void test3(){
        System.out.println(firstUniqChar("aadadaad"));
    }

    /*https://leetcode.com/problems/first-unique-character-in-a-string/*/
    public int firstUniqChar1(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               map.remove(s.charAt(i));
           }else{
               map.put(s.charAt(i),i);
           }
        }
        for (Map.Entry<Character,Integer> each:
             map.entrySet()) {
            return each.getValue();
        }
        return -1;
    }

    /*https://leetcode.com/problems/first-unique-character-in-a-string/description/
    * 1.input is a string
    * 2.output is an integer
    * 3.create an int array of size 26
    * 4.add each character count based on ascii value in the int array
    * 5.iterate the index of each character in the array
    * 6.if count for a particular character is equal to 1 then return the value of i
    * 7.if no character is unique then return -1*/
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<s.length();i++){
            int i1 = freq[s.charAt(i) - 'a'];
            if(i1 ==1){
                return i;
            }
        }
        return -1;
    }
}
