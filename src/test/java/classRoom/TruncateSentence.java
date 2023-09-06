package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class TruncateSentence {

    @Test
    public void test(){
        Assert.assertEquals("Hello how are you",truncateSentence("Hello how are you Contestant",4));
    }

    /**
     1.input is a string and int
     2.output is a string
     3.split the string using space "s\\" and store in an array
     4.return a string appending the elements in array until the given length in the input*/
    public String truncateSentence(String s, int k) {
        String[] arr=s.split("\\s");//o[n]
        StringBuilder string=new StringBuilder();
        for(int i=0;i<k;i++){//o[n]
            if(i==k-1)string.append(arr[i]);
            if(i!=k-1)string.append(arr[i]+" ");
        }
        return string.toString();
    }
}
