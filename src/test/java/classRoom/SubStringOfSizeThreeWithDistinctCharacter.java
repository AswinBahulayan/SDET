package classRoom;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SubStringOfSizeThreeWithDistinctCharacter {

    @Test
    public void test(){
        System.out.println(countGoodSubstrings("xyzzaz"));
    }

    public int countGoodSubstrings(String s) {
        StringBuilder builder=new StringBuilder();
        Map<Integer,String> map=new HashMap<>();
        int start=0,end=0,count=0;
        while(end<s.length()){
            if(end-start<3){
                builder.append(s.charAt(end));
                end++;
            }else{
                map.put(start,builder.toString());
                builder=new StringBuilder();
                start++;
                end=start;
            }
        }
        map.put(start,builder.toString());
        for(Map.Entry<Integer,String> e:map.entrySet()){
            if(isGoodString(e.getValue())){
                count++;
            }
        }
        return count;
    }

    public boolean isGoodString(String s){
        if(s.charAt(0)!=s.charAt(1) && s.charAt(0)!=s.charAt(2) && s.charAt(1)!=s.charAt(2)){
            return true;
        }
        return false;
    }
}
