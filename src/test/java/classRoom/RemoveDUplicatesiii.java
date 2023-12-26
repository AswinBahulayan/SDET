package classRoom;

import org.junit.Test;

import java.util.*;

public class RemoveDUplicatesiii {

    @Test
    public void test() {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    @Test
    public void test2() {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int e :
                nums) {
            if (map.getOrDefault(e, 0) < 2) {
                map.put(e, map.getOrDefault(e, 0) + 1);
            }
        }
        int sum = 0;
        List<Integer> values = new ArrayList<>(map.values());
        for (Integer e :
                values) {
            sum += e;
        }
        Arrays.fill(nums, 0);
        int index = 0;
        for (Map.Entry<Integer, Integer> e :
                map.entrySet()) {
            int numOfOccurence = e.getValue();
            while (numOfOccurence > 0) {
                nums[index++] = e.getKey();
                numOfOccurence--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return sum;
    }
}
