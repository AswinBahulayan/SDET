package classRoom;

import java.util.HashSet;
import java.util.Set;

public class RansomMagazine {

    public boolean ransomMagazine(String ransom,String magazine){
        int[] alphabets=new int[26];
        if(magazine.length()>ransom.length()){
            char[] ran = ransom.toCharArray();
            char[] mag = magazine.toCharArray();
            for (char c : ran) {
                alphabets[c - 'a'] += 1;
            }
            for(char e:mag){
                if(alphabets[e-'a']>0) {
                    alphabets[e - 'a'] -= 1;
                }
            }
            for (int alphabet : alphabets) {
                if (alphabet < 0) {
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}
