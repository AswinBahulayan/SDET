package classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseInteger {

    @Test
    public void test(){
        Assertions.assertEquals(2,reverseInteger1(200));
    }

    public int reverseInteger(int a){
        String s = String.valueOf(a);
        String temp="";
        for (int i = s.length()-1; i >=0 ; i--) {
            temp+=s.charAt(i);
        }
        return Integer.parseInt(temp);
    }

    public int reverseInteger1(int a){
        int rem=0;
        int rev=0;
        while(a>0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }

        return rev;
    }
}
