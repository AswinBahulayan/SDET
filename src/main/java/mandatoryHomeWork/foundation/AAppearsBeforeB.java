package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class AAppearsBeforeB {

    public static void main(String[] args) {
        checkString("aaabb");
    }
    public static boolean checkString(String s) {
        if(s.contains("ba")) {
         return false;
        }else{
            return true;
        }
    }
}
