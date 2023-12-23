package classRoom;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestCommonPrefix {

    @Test
    public void test1() {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void test() {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        Set<Character> set = new LinkedHashSet<>();
        int i = 0;
        if (strs.length == 0) return "";
        else if (strs.length == 1) return strs[0];
        else {
            outer:
            while (i < minLength) {
                for (String e : strs) {
                    if (e.length() < minLength) {
                        minLength = e.length();
                    }
                    if (!e.isEmpty()) {
                        char s = e.charAt(i);
                        set.add(s);
                    } else {
                        break outer;
                    }
                }
                if (set.size() != 1) {
                    break;
                } else {
                    builder.append(set.iterator().next());
                    set.clear();
                }
                i++;
            }
        }
        return builder.toString();
    }
}
