package foundation;

public class MergeStringAlternatively {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String temp="";
        if(word1.length()==word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                temp=temp+word1.charAt(i)+word2.charAt(i);
            }
        }else if(word1.length()>word2.length()){
            for (int i = 0; i < word2.length(); i++) {
                temp=temp+word1.charAt(i)+word2.charAt(i);
            }
            temp=temp+word1.substring(word2.length(),word1.length());
        }else{
            for (int i = 0; i < word1.length(); i++) {
                temp=temp+word1.charAt(i)+word2.charAt(i);
            }
            temp=temp+word2.substring(word1.length(),word2.length());
        }
        return temp;
    }
}
