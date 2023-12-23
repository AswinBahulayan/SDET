package classRoom;

import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

public class SubStringWithoutRepeatingChar {

    @Test
    public void test(){
        System.out.println(subStringWithoutRepeatingChar("abcabcbb"));
    }

    @Test
    public void test1(){
        System.out.println(subStringWithoutRepeatingChar("abcdefgh"));
    }

    @Test
    public void test3(){
        System.out.println(subStringWithoutRepeatingChar("abcdefgha"));
    }

    @Test
    public void test5(){
        System.out.println(subStringWithoutRepeatingChar("aaaab"));
    }



    @Test
    public void test4(){
        System.out.println(subStringWithoutRepeatingChar("auabc"));
    }

    /*
    Longest Substring without Repeating Characters:
Given a string, find the length of the longest substring without repeating characters.
String input = "abcabcbb";
// Output: 3 (for "abc")

    * 1.iterate the string using  pointer right from 0
    * 2.declare a HashSet of characters
    * 3.add the character at right to set
    * 4.if the return of add is true then increment right
    * 5.else remove character at right
    * 6.finally return set.size()*/
    public int subStringWithoutRepeatingChar(String s){
        int right=0;
        Set<Character> set=new HashSet<>();//O(n)-sc
        while ( right<s.length()){//O(n)-tc
            if(set.add(s.charAt(right))){
                right++;
            }else{
                set.remove(s.charAt(right));
            }
        }
        return set.size();
    }
}
