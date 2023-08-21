package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class SortingAnArray {

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 6, 9}, sort(new int[]{3, 4, 2, 6, 1, 9}));
    }

    public int[] sort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
