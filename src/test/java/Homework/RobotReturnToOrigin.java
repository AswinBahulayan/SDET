package Homework;

import org.junit.Assert;

public class RobotReturnToOrigin {

    /*
    * 1.input is a string
    * 2.output us boolean
    * 3.assign integer variable  R,U,L,D to get the direction
    * 4.iterate the string and add the direction to a variable, if sum is 0 then return true
    * else false*/

    public static void main(String[] args) {
        System.out.println(judgeCircle("RRRD"));
    }

    public static boolean judgeCircle(String moves) {
       int leftRight=0;
       int upDown=0;
        int count=0;
        for (int i=0;i<moves.length();i++) {
            switch (moves.charAt(i)){
                case 'R':
                    leftRight++;
                    break;
                case 'U':
                    upDown++;
                    break;
                case 'L':
                    leftRight--;
                    break;
                case 'D':
                    upDown--;
                    break;
            }
        }
        return leftRight==0 && upDown==0;
    }
}
