package mandatoryHomeWork.foundation;

import java.util.regex.Pattern;

public class ReplaceAllDigits {

    /**
     * 1.convert string to charArray
     * 2.iterate to the odd indexes using for loop
     * 3.add the integer value to the previous character in array and replace current index value with the sum and typecast to char
     * 4.convert array back to string using foreach loop
     */

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }

    public static String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        int temp=0;
        for (int i = 1; i < chars.length; i+=2) {
            temp = chars[i-1] + Character.getNumericValue(chars[i]);
            chars[i]=(char) temp;
        }
        String finalString="";
        for (char each:
             chars) {
            finalString+=each;
        }
        return finalString;
    }

    /*
    * public String replaceDigits(String s) {
        int temp=0;
        String finalString="";
        for (int i = 1; i < s.length(); i+=2) {
            temp = s.charAt(i-1) + Character.getNumericValue(s.charAt(i));
            finalString+=s.charAt(i-1);
            finalString+=(char)temp;
        }
        return s.length()%2==0?finalString:finalString+s.charAt(s.length()-1);
    }*/
}
