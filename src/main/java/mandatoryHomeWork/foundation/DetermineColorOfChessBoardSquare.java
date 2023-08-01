package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetermineColorOfChessBoardSquare {

    /*
     * 1.if both x and y axis are odd then output is black
     * 2.if both x and y axis are even then output is black
     * 3.if x is even and y is odd or vice versa then it is white
     * 4. if black return false else return true*/

    @Test
    public void test1(){
        Assertions.assertEquals(false,squareIsWhite("a1"));
    }

    public boolean squareIsWhite(String coordinates) {
        boolean flag = false;
        if ((Character.getNumericValue(coordinates.charAt(0)) % 2 == 0 && coordinates.charAt(1) % 2 == 0) || (Character.getNumericValue(coordinates.charAt(0)) % 2 != 0 && coordinates.charAt(1) % 2 != 0)) {
            return false;
        } else{
            return true;
        }
    }


}
