package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RansomNote {

    @Test
    public void test(){
        Assert.assertEquals(false,canConstruct("a","b"));
    }

    @Test
    public void test1(){
        Assert.assertEquals(false,canConstruct("fihjjjjei","hjibagacbhadfaefdjaeaebgi"));
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())return false;
        int[] output=new int[26];
        for(int i=0;i<magazine.length();i++){
            output[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            output[ransomNote.charAt(i)-'a']--;
            if(output[ransomNote.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i),1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(map.containsKey(ransomNote.charAt(i))){
                map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)-1);
                if(map.get(ransomNote.charAt(i))<0){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        int left=0,right=0;
        if(magazine.length()<ransomNote.length())return false;
        Map<Character,Integer> map=new ConcurrentHashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i),1);
            }

        }
        return true;
    }
}
