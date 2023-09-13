package Homework;

public class ReverseAGivenString {

    /**
     1.input is string
     2.output is a string
     3.split the given string based on space and store in an array.
     4.iterate the array and reverse each string and append it to a string builder
     5.append it to a stringBuilder and return it */
    public String reverseWords(String s) {
        String[] split=s.split("\\s");
        StringBuilder output=new StringBuilder();
        for(int i=0;i<split.length;i++){
            output.append(reverse(split[i]));
            output.append(" ");
        }
        return output.toString().trim();
    }

    public String reverse(String s){
        StringBuilder output=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            output.append(s.charAt(i));
        }
        return output.toString();
    }


}
