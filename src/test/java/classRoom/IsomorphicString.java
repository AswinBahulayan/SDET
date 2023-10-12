package classRoom;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    @Test
    public void test() {
        System.out.println(isIsomorphic2("foo", "bar"));
    }

    /**
     * 1.input is two string
     * 2.output is a boolean
     * 3.declare a string variable to determine whether the repetition of each character
     * 4.iterate through the string, if the charAt at i and i-1 are equal continue
     * 5.else increment the counter and add to a string
     * 6.repeat the same step for second string
     * 7.if both the string have same repetition return true else false
     */
    public boolean isIsomorphic(String s, String t) {
        int charOfs = 0;
        int charOft = 0;
        if (s.length() != t.length()) return false;
        String a = findRepetition1(s);
        String b = findRepetition1(t);
        return a.equals(b);
    }

    private String findRepetition(String string) {
        int charOft = 0;
        StringBuilder b = new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i),charOft++);
            }
        }
        for (int i = 0; i < string.length(); i++) {
            b.append(map.get(string.charAt(i)));
            b.append(";");
        }
        System.out.println(map);
        System.out.println(b.toString());
        return b.toString();
    }

    private String findRepetition1(String string) {
        int charOft = 0;
        StringBuilder b = new StringBuilder();
        int[] map=new int[256];
        for (int i = 0; i < string.length(); i++) {
            if(map[string.charAt(i)]==0){
                charOft++;
                map[string.charAt(i)]=charOft;
            }
            b.append(map[string.charAt(i)]);
            b.append(";");
        }
        System.out.println(b.toString());
        return b.toString();
    }

    public boolean isomorphicStrings(String s, String t) {
        int[] arr_s=new int[256];
        int[] arr_t=new int[256];
        for (int i = 0; i < s.length(); i++) {
            char char_s=s.charAt(i);
            char char_t=t.charAt(i);
            if(arr_s[char_s]==0)
                arr_s[char_s]=char_t;
            if(arr_t[char_t]==0)
                arr_t[char_t]=char_s;

            if(arr_s[char_s]!=char_t ||arr_t[char_t]!=char_s)
                return false;

        }

        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for(int i =0;i<s.length();i++){
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]){
                return false;
            }
            arr1[s.charAt(i)] = i+1;
            arr2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
