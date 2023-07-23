package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class PalindromeRegex {

    public static void main(String[] args) {
        String value="ab_a";
        value=value.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(value);
    }
    public boolean palindromeRegex(String value){
        value=value.replaceAll("[^a-bA-Z0-9]","");
        value=value.toLowerCase();
        String temp="";
        for (int i = value.length()-1; i >=0 ; i--) {
            temp+=value.charAt(i);
        }
        if(temp.equals(value)){
            return true;
        }else{
            return false;
        }

    }
}
