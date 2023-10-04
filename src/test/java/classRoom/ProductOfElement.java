package classRoom;

import java.util.Arrays;

public class ProductOfElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productOfElement(new int[]{1,2,3})));
    }

    /*
    * 1.input is array
    * 2.output is array
    * 3.find the product of elements except product of current element
    * 4.iterate the array
    * 5.iterate another nested loop inside first loop
    * 6.declare a integer variable product to find the product of element
    * 7.if j is not equal to ith index then add the product and assign it to*/

    public static int[] productOfElement(int[] a){
        int[] output=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int product=1;
            for (int j = 0; j < a.length; j++) {
                if(j!=i){
                    product*=a[j];
                }
            }
            output[i]=product;
        }
        return output;
    }

    /*public static int[] productOfElement(int[] a){
        int[] output=new int[a.length];
        int left=0,right=1,product=1;

        while (left+1!=a.length){
            if(right!=left){
                product*=a[right];
            }
            right++;
            if(right==a.length-1){
                output[left]=product;
                product=1;
                left++;
                right=0;
            }
        }
    }*/
}
