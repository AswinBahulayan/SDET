package Homework;

public class CheckIfSentenceIsPangram {
    /**
     1.input is a string
     2.output is boolean
     3.Create a for loop with limit starting from 97 to 122
     4.Iterate the string nested with the first for loop
     5.using a boolean variable confirm if the value from first loop is avaiable in the second string
     6.time complexity o[n*m]*/
    public boolean checkIfPangram(String sentence) {
        boolean flag=false;
        if(sentence.length()<26) return false;
        for(int i=97;i<=122;i++){//o[n]
            flag=false;
            for(int j=0;j<sentence.length();j++){//o[m]
                if(sentence.charAt(j)==i){
                    flag=true;
                }
            }
            if(!flag){
                return flag;
            }
        }
        return flag;
    }
}
