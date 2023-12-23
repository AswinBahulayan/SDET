package classRoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ProductOfElements {

    @Test
    public void test(){
        System.out.println(Arrays.toString(productOfElements1(new int[]{1,2,3})));
    }

    /*1.input is an array
    * 2.output is an array
    * 3.iterate the given array
    * 4.iterate the given array inside the first loop
    * 5.if i is not equal to j then get the product of each element to a variable
    * 6.assign the value of prod in the ith index of the newly created array
    * 7.finally return the newly created array.*/
    public int[] productOfELements(int[] a){
        int[] b=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int prod=1;
            for (int j = 0; j < a.length; j++) {
                if(j!=i){
                   prod*=a[j];
                }
            }
            b[i]=prod;
        }
        return b;
    }

    public int[] productOfElements1(int[] a){
        int[] b=new int[a.length];//o[n]-> space complexity
        int prod=1;
        for (int j : a) {//o[n]->time complexity
            prod *= j;
        }
        for (int i = 0; i < a.length; i++) {//o[n]
            if(a[i]!=0) {
                b[i] = prod / a[i];
            }
        }
        return b;
    }
}
