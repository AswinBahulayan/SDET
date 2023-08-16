package Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CheckStrainghtLine {

    /*1.input in 2d array
     * 2.output is boolean
     * 3.To check if the 2d array produces a straight line check if the interval between x and y axis is equal
     * 4.use temp variable to check the difference
     * 5.if the diff between first two index and seco*/

    @Test
    public void test() {
        Assertions.assertEquals(true, checkStraightLine1(new int[][]{{1, -8}, {2, -3}, {1, 2}}));
    }

    public boolean checkStraightLine(int[][] coordinates) {
        int temp = 0;
        for (int k = 0; k < coordinates.length; k++) {
            for (int j = 0; j < coordinates[0].length; j++) {
                for (int i = 0; i < coordinates.length; i++) {
                    if (i != coordinates.length - 1) {
                        if (coordinates[i][j] > coordinates[i + 1][j]) {
                            temp = coordinates[i][j];
                            coordinates[i][j] = coordinates[i + 1][j];
                            coordinates[i + 1][j] = temp;
                        }
                    }
                }
            }
        }
        int diffX = coordinates[1][0] - coordinates[0][0];
        int diffY = coordinates[1][1] - coordinates[0][1];
        for (int j = 0; j < coordinates[0].length; j++) {
            for (int i = 0; i < coordinates.length; i++) {
                if (j == 0) {
                    if (i != coordinates.length - 1) {
                        int diff = coordinates[i][j] - coordinates[i + 1][j];
                        if (diff < 0) diff = diff * -1;
                        if (diff != diffX) return false;
                    }
                } else {
                    if (i != coordinates.length - 1) {
                        int diff = coordinates[i][j] - coordinates[i + 1][j];
                        if (diff < 0) diff = diff * -1;
                        if (diff != diffY) return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean checkStraightLine1(int[][] coordinates) {
        int temp = 0;
        for (int k = 0; k < coordinates.length; k++) {
            for (int j = 0; j < coordinates[0].length; j++) {
                for (int i = 0; i < coordinates.length; i++) {
                    if (i != coordinates.length - 1) {
                        if (coordinates[i][j] > coordinates[i + 1][j]) {
                            temp = coordinates[i][j];
                            coordinates[i][j] = coordinates[i + 1][j];
                            coordinates[i + 1][j] = temp;
                        }
                    }
                }
            }
        }
        boolean flag=true;
        boolean checkIfXAxisOrYAxisIsSame = true;
        for (int j = 0; j < coordinates[0].length; j++) {
            for (int i = 0; i < coordinates.length; i++) {
                if (i != coordinates.length - 1) {
                    if (coordinates[i][j] != coordinates[i + 1][j]) {
                        checkIfXAxisOrYAxisIsSame = false;
                    }
                }
            }
            if (checkIfXAxisOrYAxisIsSame) {
                return checkIfXAxisOrYAxisIsSame;
            }
            checkIfXAxisOrYAxisIsSame = true;
        }
        int diffX = coordinates[1][0] - coordinates[0][0];
        int diffY = coordinates[1][1] - coordinates[0][1];
        for (int j = 0; j < coordinates[0].length; j++) {
            for (int i = 0; i < coordinates.length; i++) {
                if (j == 0) {
                    if (i != coordinates.length - 1) {
                        int diff = coordinates[i][j] - coordinates[i + 1][j];
                        if (diff < 0) diff = diff * -1;
                        if (diff != diffX) {
                            flag = false;
                        }
                    }
                } else {
                    if (i != coordinates.length - 1) {
                        int diff = coordinates[i][j] - coordinates[i + 1][j];
                        if (diff < 0) diff = diff * -1;
                        if (diff != diffY) {
                            flag = false;
                        }
                    }
                }
            }
        }
        return flag;
    }
}
