package classRoom;

import org.junit.Test;

public class DecreasingString {

    @Test
    public void test(){
        System.out.println(sortString("aaaabbbbcccc"));
    }

    /**
     1.input is a string
     2.output is a string
     3.create a an array with length 128
     4.iterate the string and store the count of each character in appropriate index (ASCII value of each character)
     5.using the count of each chracter stored in array create a temporary string to store the charcters in ascending and descending order until the count of charcter is zero
     6.time complexity is o[n+m]*/
    public String sortString(String s) {
        int[] arr = new int[128];
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); i++){//o[n]
            arr[s.charAt(i)]+=1;
        }
        int count = s.length();
        while (count > 0) {//o[m]
            for (int i = 96; i < 123; i++) {//o[1]
                if (arr[i] != 0) {
                    output.append((char)i);
                    arr[i]--;
                    count--;
                }
            }
            for (int i = 123; i > 96; i--) {//o[1]
                if (arr[i] != 0) {
                    output.append((char)i);
                    arr[i]--;
                    count--;
                }
            }
        }
        return output.toString();
    }
}
