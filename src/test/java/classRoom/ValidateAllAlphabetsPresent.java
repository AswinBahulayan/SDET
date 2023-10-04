package classRoom;

import java.util.*;

public class ValidateAllAlphabetsPresent {


    public boolean validateAllAlphabetsPresent(String a){
        if(a.length()<26) return false;
        int[] b=new int[26];
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=32) {
                b[a.charAt(i) - 'a']++;
            }
        }
        for (int j : b) {
            if (j == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean validateAllAlphabetsPresent2(String a){
        if(a.length()<26) return false;
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != 32) {
                set.add(a.charAt(i));
            }
        }
        return set.size()==26;
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int num=0;
        for (int j : nums) {
            if (!set.add(j)) {
                set.remove(j);
            }
        }
        return set.iterator().next();
    }
}
