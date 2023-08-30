package classRoom;

import java.util.Arrays;

public class MostWordsFound {

    /**
     1.input is a array of string containing sentences
     2.output is to return the maximum number of words in a sentence
     1.iterate the array
     2.split the array based on */
    public int mostWordsFound(String[] sentences) {
        int[] output=new int[sentences.length];
        int count=0;
        for (int i=0;i<sentences.length;i++){
            for(int j=0;j<sentences[i].length();j++){
                if(!Character.isAlphabetic(sentences[i].charAt(j))){
                    count++;
                }
            }
            output[i]=count+1;
            count=0;
        }
        Arrays.sort(output);
        return output[output.length-1];
    }
}
