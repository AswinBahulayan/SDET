package classRoom;

public class ConsecutiveCharacter {

    public static void main(String[] args) {
        System.out.println(maxPower("aabbbbbccccdddddddeffffffggghhhhhiiiiijjjkkkkkllllmmmmmnnnnnoopppqrrrrsssttttuuuuvvvvwwwwwwwxxxxxyyyzzzzzzzz"));
    }

    /**
     1.input is a string
     2.output is an integer
     3.declare variables
     int left,right,power
     4.all three variables are initialized to zero
     5.iterate the given string
     6.increment right until characters are similar
     7.take the difference between left and right and store it in power
     8.if characters are not similar chnage left = right
     9.finally return the value of power */
    public static int maxPower(String s) {
        int left=0,right=0,power=0;
        if(s.length()==1)return 1;
        while(right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                ++right;
            }else{
                power=Math.max(power,right-left);
                left=right;
            }
        }
        if(right==s.length())power=Math.max(power,right-left);
        return power;
    }
}
