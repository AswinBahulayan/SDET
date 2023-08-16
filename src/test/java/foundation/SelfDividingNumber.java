package foundation;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    /*1. iterate using the left and right variable as limits
    * 2. convert the value of i to charArray and iterate the array to find if i is divisible by j
    * 3. if yes then set flag to true if no then set flag to false and break inner loop
    * 4.also if the charArray contains 0 break inner loop
    * 5. else add i to the list<Integer>
    6. return List<Integer>*/

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumber = new ArrayList<Integer>();
        boolean Flag = false;
        for (int i = left; i <= right; i++) {
            char[] value = String.valueOf(i).toCharArray();
            inner:for (int j = 0; j < value.length; j++) {
                if ((Character.getNumericValue(value[j]) != 0)) {
                    if ((i % Character.getNumericValue(value[j]) == 0)) {
                        Flag = true;
                    }else{
                        Flag=false;
                        break inner;
                    }
                }else{
                    Flag=false;
                    break;
                }
            }
            if (Flag) {
                selfDividingNumber.add(i);
            }
            Flag=false;
        }
        return selfDividingNumber;
    }
}
