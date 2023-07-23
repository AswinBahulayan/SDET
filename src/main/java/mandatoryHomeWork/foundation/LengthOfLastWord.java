package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLastWord {

    /*1.Get the Input string
     2.Trim the string using trim method
     3.Reverse the String value
     4.If the string contains space then break
     5. get the length of the stored string
*/

    @Test
    public void test(){
        Assertions.assertEquals(5,lengthOfLastWord("Hello World"));
    }


    public int lengthOfLastWord(String s) {
        s=s.trim();
        String temp="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                temp+=s.charAt(i);
            }else{
                break;
            }
        }
        return temp.length();
    }
}
