package classRoom;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SortingTheSentence {

    @Test
    public void test(){
        Assert.assertEquals("This is a sentence",sortSentence("is2 sentence4 This1 a3"));
    }

    @Test
    public void test2(){
        Assert.assertEquals("Me Myself and I",sortSentence("Myself2 Me1 I4 and3"));
    }

    /**
     1.input is a strring
     2.output is a string
     3.split the string using space and add to an array
     4.Using the last char of each element in array append to the stringbuilder excluding the last character of each string
     5. time complexity o[n*m]*/
    public static String sortSentence(String s) {
        String[] input=s.split("\\s");//o[n]
        StringBuilder output=new StringBuilder();
        for(int i=1;i<=input.length;i++){//o[n]
            for (String string : input) {//o[m]
                if (Character.getNumericValue(string.charAt(string.length() - 1)) == i) {
                    output.append(string.replaceAll("[0-9]", ""));
                    output.append((char) 32);
                }
            }
        }
        System.out.println(output.toString().trim());
        return output.toString().trim();
    }
}
