package foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> sum=new ArrayList<>();
        for (Integer num:
                nums) {
            sum.add(num);
        }
        for (int i = 0; i < sum.size(); i++) {
            if(sum.get(i)!=i){
                return i;
            }
        }
        return sum.size();
    }
}
