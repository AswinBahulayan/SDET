package Homework;

public class RemoveVowels {

    /*
    * 1.input is a String
    * 2. out put is string with vowels removed
    * ex : if input is apple then output must be ppl
    * 3.create string with the vowels. String Vowels="aeiouAEIOU"
    * 4.iterate the vowels string over the input string
    * 5.compare each character of vowels with the input string. if any of the character matches
    * make the character empty and append it
    * 6.final return the string*/

    public static void main(String[] args) {
        System.out.println(removeVowels("Hi testleaf students"));
    }

    public static String removeVowels(String input){
        String output="";
        String vowels="aeiouAEIOU";
        boolean flag=true;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if(input.charAt(i)==vowels.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
            output+=input.charAt(i);
            }
            flag=true;
        }
        return output;
    }
}
