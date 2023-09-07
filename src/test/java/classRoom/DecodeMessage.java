package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class DecodeMessage {

    @Test
    public void test(){
        Assert.assertEquals("this is a secret",decodeMessage("the quick brown fox jumps over the lazy dog"
                ,"vkbs bs t suepuv"));
    }

    @Test
    public void test1(){
        Assert.assertEquals("the five boxing wizards jump quickly",decodeMessage("eljuxhpwnyrdgtqkviszcfmabo"
                ,"zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

    /**
     1.input is a pair of strings
     2.output is a string
     3.create an array of length 122.
     4.iterate through the array from 97 to 122 based on ascii character of lower case alphabets
     5.in a nested loop iterate the given key
     6.if the idex of ith character is not equal to zero then assign the ascii value of 'a'
     7.likewise repeat for every other charcter in the array.
     8.based on the characters given in message fetch the value for each character created before and append it to a temp string and return it
     9.time complexity is o[n]*/
    public String decodeMessage(String key, String message) {
        key=key.replaceAll(" ","");//o[n]
        char[] letters=new char[123];
        for(int i=97;i<=122;i++){//o[1]
            for(int j=0;j<key.length();j++){//o[n]
                if(letters[key.charAt(j)]==0){
                    letters[key.charAt(j)]=(char)i;
                    break;
                }
            }
        }
        StringBuilder output=new StringBuilder();
        for(int j=0;j<message.length();j++){//o[m]
            if(message.charAt(j)==32){
                output.append((char)32);
            }else{
                output.append(letters[message.charAt(j)]);
            }
        }
        return output.toString();
    }
}
