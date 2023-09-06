package classRoom;

import java.util.ArrayList;
import java.util.List;

public class CountBinarySubString {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings1("000111000"));
    }

    public static int countBinarySubstrings(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sub = new StringBuilder();
        int count = 0;
        int subsStringCount = 0;
        List<String> subString = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (arr[i] == arr[i + 1]) {
                    sub.append((char) arr[i] + "" + arr[i + 1]);
                } else {
                    count++;
                    subsStringCount++;
                }

            }
            if ((subsStringCount > 1 || i == s.length() - 1) && !sub.isEmpty()) {
                subString.add(sub.toString());
                sub.setLength(0);
                subsStringCount = 0;
            }
        }
        for (int i = 0; i < subString.size(); i++) {
            for (int j = i + 1; j < subString.size(); j++) {
                if (subString.get(i).equals(subString.get(j))) {
                    count += 1;
                }
            }
        }
        if (subString.size() == 1 && (subString.get(0).contains("01") || subString.get(0).contains("10"))) {
            count += 1;
        } else if (subString.size() > 1) {
            count += subString.size();
        }
        return count;
    }

    /**
     1.input is a string
     2.output is an integer
     3.declare two var current and previous
     4.initialize current with 1 and previous with 0
     5.iterate the array with initial value at 1
     6.if previous element is same as current element increment currentLength
     7.else assign previous length as currentlength and reset currentlength to 1
     8.if previous length is greater than or equal to currentlength then increment the count variable
     9.finally return count variable*/
    public static int countBinarySubstrings1(String s) {//110010011
        int currentLength = 1;
        int previousLength = 0;
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                currentLength++;
            } else {
                previousLength = currentLength;
                currentLength = 1;
            }
            if (previousLength >= currentLength) {
                count++;
            }
        }
        return count;
    }
}
