package foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggestCharacter {


    public char biggestCharacter(char[] arr,char target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>target){
                return arr[i];
            }
        }
        return target;
    }

    @Test
    public void test(){
        char[] ch={'b','d','h'};
        Assertions.assertEquals('h', biggestCharacter(ch,'e'));
        }

    }
