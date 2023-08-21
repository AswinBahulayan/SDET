package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeWithNoConversionTOString {

    @Test
    public void test(){
        Assert.assertEquals(true,isPalindrome(121));
    }

    /*
    * 1.input is a int
    * 2.output is boolean
    * 3.declare three variables
    * 4. one to store the initial value of x and other to store X%10 and other store reversed int
    * 5.get x%10 in rem and store rev*10+rem in rev
    * 6.divide x by 10
    * 7. repeat until x is 0
    * 8. finally compare rev and intial value*/
    public boolean isPalindrome(int x) {
        int temp=x;
        int rem=0;
        int rev=0;
        while(x>0){
            rem=x%10;//10
            rev=rev*10+(rem);//12
            x=x/10;//1
        }
        return rev==temp;

    }
}
