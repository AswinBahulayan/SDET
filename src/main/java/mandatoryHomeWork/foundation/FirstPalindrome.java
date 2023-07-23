package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstPalindrome {

    @Test
    public void test() {
        String actual = findPalidndromfromarray(new String[] {"abc","car","ada","racecar","cool"});
        Assertions.assertEquals("ada", actual);
    }

    public String findPalidndromfromarray(String[] words) {
        String temp="";
        String reverse="";

        for (int i = 0; i < words.length; i++) {
            temp = words[i];   //abc
            for (int  j = temp.length()-1; j >= 0;j--) { //cbarac
                reverse=reverse+temp.charAt(j);
            }
            if(reverse.equals(temp)) {
                return temp;}
            else {
                reverse="";
            }
        }
        return "";
    }
}
