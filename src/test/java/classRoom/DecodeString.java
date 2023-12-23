package classRoom;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

public class DecodeString {

    @Test
    public void test() {
        String s = decodeString("3[a]2[bc]");
        System.out.println(s);

    }

    @Test
    public void test1() {
        String s = decodeString("3[a2[c]]");
        System.out.println(s);

    }

    @Test
    public void test2() {
        String s = decodeString("2[abc]3[cd]ef");
        System.out.println(s);

    }

    @Test
    public void test3() {
        String s = decodeString("abc3[cd]xyz");
        System.out.println(s);

    }

    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String out = "";
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            if (stack.peek() == ']') {
                stack.pop();
                output.append(out);
                out="";
            } else if (stack.peek() == '[') {
                stack.pop();
                int a = Character.getNumericValue(stack.pop());
                while (a > 0) {
                    output.append(out);
                    a--;
                }
                if(stack.peek()=='['){
                    out="";
                }
            } else if (Character.isAlphabetic(stack.peek())) {
               out+=stack.pop();

            }
        }
        return output.reverse().toString();
    }

    /*public static void main(String[] args) {
        search(new int[]{1,2,3,4,5,6,7},6);
    }*/
    public static void sor(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int pivot = i;
            for (int j = i; j >= 0; j--) {
                if (a[pivot] > a[j]) {
                    int temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    //Divide and conquer
    public static int search(int[] a, int b) {
        int left = 0, right = a.length - 1, mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (b > a[mid]) {
                left = mid;
            } else if (b < a[mid]) {
                right = mid;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
