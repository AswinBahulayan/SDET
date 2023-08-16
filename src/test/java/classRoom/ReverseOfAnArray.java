package classRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseOfAnArray {

    /*
    * 1.input is an array
    * 2.output is an array
    * 3.There are no constraints
    * 4.iterate the array with initial value as the length and decrement the value of i
    * 5.create a new array with the same size as the input array and use a temp variable to
    * iterate through the index using same for loop*/
    
    public char[] test(char[] arr){
        char[] num=new char[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0; i--) {
            num[j]=arr[i];
            j++;
        }
        return num;
    }

    /*'a', 'b', 'c', 'd', 'e',f
    f,b,c,d,e,a
    i=0;j=5
    i=1;j=4
    i=2;j=3
    i=3;j=2
    f,e,c,d,b,a
    f,e,c,d,b,a

    * i=e
    * j*/
    @Test
    public void test(){
        Assertions.assertArrayEquals(new char[]{'f','e','d','c','b','a'},test1(new char[]{'a', 'b', 'c', 'd', 'e','f'}));
    }
    public char[] test1(char[] arr){
        int j=0;
        char temp=' ';
        for (int i = arr.length-1; i >=0; i--) {
            if(j>i) break;
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           j++;
        }
        return arr;
    }
}
