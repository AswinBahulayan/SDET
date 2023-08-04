package mandatoryHomeWork.classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NearestMultipleOfTen {

    /*
    * 1.input is a int
    * 2.if the input%10 is not equal to 0 then iterate over a while loop
    * 3.use a temp variable to calculate the reminder of input%10
    * if rem is greater than 5 then increment else decrement*/

    @Test
    public void test(){
        Assertions.assertEquals(30,nearestMultipleOfTen(29));
    }

    public int nearestMultipleOfTen(int a){
        int temp=0;
        if(a<10){
            return 10;
        }
       while(a%10!=0){
           temp=a%10;
           if(temp>5){
               a++;
           }else{
               a--;
           }
       }
       return a;
    }
}
