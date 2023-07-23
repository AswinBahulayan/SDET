package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;

public class SteingHalvesAreAlike {

    public void test(){
        Assertions.assertEquals(true,halvesAreAlike("book"));
    }

    public boolean halvesAreAlike(String s) {
        String sub1 = s.substring(0, s.length() / 2);
        String sub2 = s.substring(s.length() / 2, s.length());
        return compare(sub1)==compare(sub2);
    }

    public int compare(String s){
        String vowels="aeiouAEIOU";
        int i1 = vowels.indexOf(s.charAt(1));
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
//            for (int j = 0; j < vowels.length(); j++) {
                if(vowels.indexOf(s.charAt(i))==1){
                    count++;
                }
//            }
        }
        return count;
    }
}
