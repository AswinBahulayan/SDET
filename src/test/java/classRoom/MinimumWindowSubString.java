package classRoom;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumWindowSubString {


    @Test
    public void test(){
        System.out.println(minimumWindowSubString("ADOBECODEBANC","ABC"));
    }

    @Test
    public void test1(){
        System.out.println(minimumWindowSubString("ADOBECODE","ABC"));
    }

    @Test
    public void test2(){
        System.out.println(minimumWindowSubString("ABCEFGH","ABC"));
    }

    /*
    Minimum Window Substring:
Given a string S and a string T, find the minimum window in S that contains all the characters of T in complexity O(n).
String S = "ADOBECODEBANC";
String T = "ABC";
// Output: "BANC"

    * 1.add the string t to HashSet
    * 2.declare two point left and right at 0
    * 3.if set contains s.charAt(left) then start incrementing the right and add each character to a string builder until set is empty
    * 4.else increment left and assign right to left
    * 5.if set is empty check if value of stringBuilder is less than output and swap it
    * 6.continue until
    * */
    public String minimumWindowSubString(String s,String t){
        char[] arr1 = s.toCharArray();
        int left=0,right=0;
        StringBuilder currString=new StringBuilder();
        String output=s;
        Set<Character> charToCheck = addToSet(t);
        while (left<s.length()){
            if(charToCheck.contains(s.charAt(left))){
                while (!charToCheck.isEmpty()){
                    charToCheck.remove(s.charAt(right));
                    currString.append(s.charAt(right));
                    right++;
                }
            }else{
                left++;
                right=left;
            }
            if(charToCheck.isEmpty()){
                if(currString.toString().length()<output.length()){
                    output=currString.toString();
                }
                currString=new StringBuilder();
                charToCheck=addToSet(t);
                right++;
                left=right;
            }
        }
        return output;
    }

    public Set<Character> addToSet(String t){
        Set<Character> set=new HashSet<>();
        for (char e:
             t.toCharArray()) {
            set.add(e);
        }
        return set;
    }
}
