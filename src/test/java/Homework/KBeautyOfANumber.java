package Homework;

public class KBeautyOfANumber {

    /**
     1.input is a pair of integers
     2.output is an integer
     3.declare variables
     string a -> store the num
     int left equal to 0
     int right is equal to k
     int count
     4.iterate the strring until right is <or equal to string length
     5.get substring of a with left and right as start and end index and check if given num is divisible by the integer value of substring. if yes increment counter
     6.increment left and right
     7.return count*/
    public int divisorSubstrings(int num, int k) {
        String a=num+"";
        int left=0,right=k,count=0;
        while(right<=a.length()){
            System.out.println(a.substring(left,right));
            if(Integer.parseInt(a.substring(left,right))!=0){
                if(num % Integer.parseInt(a.substring(left,right))==0){
                    count++;
                }
            }
            left++;right++;
        }
        return count;
    }
}
