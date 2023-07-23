package mandatoryHomeWork.foundation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JewelsAndStones {

    @Test
    public void test(){
        Assertions.assertEquals(3,numJewelsInStones("aA","aAa"));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
