package Homework;

import org.junit.jupiter.api.Test;

public class SwapTwoNumbersWithOutThirdNumber {

    @Test
    public void test() {
        swap(45, 98);
    }

    public void swap(int x, int y) {
        /*x=1 ;y=2*/
        System.out.println(" Before swap x : " + x + " y : " + y);
        x = x + y; //1+2=3;
        y = x - y;//3-2=1;
        x = x - y;//3-1=2;
        System.out.println(" After swap x : " + x + " y : " + y);
    }
}
