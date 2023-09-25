package classRoom;

import org.junit.Assert;
import org.junit.Test;

public class MinRecolorsToGetKConsecutiveBlackBlocks {

    @Test
    public void test() {
        Assert.assertEquals(3,minimumRecolors("WBBWWBBWBW",7));
    }

    @Test
    public void test1() {
        Assert.assertEquals(0,minimumRecolors("WBWBBBW",2));
    }

    /**
     1.input is a string and an integer
     2.output is an integer
     3.declare variable
     window=0;
     minw=Integer.MAX_VALUE
     int[] output=new int[26];
     4.iterate the given integer until k and increment value  at the index based on ascii for each character using window as a pointer.
     5.check if count B at ascii index is equal to the value of k if yes return 0
     6.else value at index of W to minW.
     7.again iterate the string from the position of window until window less than the length of string
     8.in each iteration increment the value of current index and decrement the value of index at window-k.
     9.repeat step 5 and 6, increment window until it reaches the length of string.
     */
    public static int minimumRecolors(String blocks, int k) {
        int window=0,minW=Integer.MAX_VALUE;
        int[] output=new int[26];
        while(window<k){
            output[blocks.charAt(window)-'A']+=1;
            window++;
        }
        if(output['B'-'A']>=k){
            return 0;
        }else if(output['W'-'A']<minW){
            minW=output['W'-'A'];
        }
        while(window<blocks.length()){
            output[blocks.charAt(window)-'A']+=1;
            output[blocks.charAt(window-k)-'A']-=1;
            if(output['B'-'A']>=k){
                return 0;
            }else if(output['W'-'A']<minW){
                minW=output['W'-'A'];
            }
            window++;
        }
        return minW;
    }
}
