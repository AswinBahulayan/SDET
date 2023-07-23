package mandatoryHomeWork.foundation;

public class Palindrome {

    public boolean palindrome(int n){
        String actual = String.valueOf(n);
        String expected="";
        for (int i = actual.length()-1; i >=0 ; i--) {
            expected+=actual.charAt(i);
        }
        if(expected.equals(actual)){
            return true;
        }else{
            return false;
        }
    }
}
