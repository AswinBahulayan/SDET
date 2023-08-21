package classRoom;

import org.junit.Assert;
import org.testng.reporters.jq.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintElementInArray {

    public static void main(String[] args) {
        /*printElementInArray(new int[]{1,2,3,4});
        Employee[] emp=new Employee[10];
//        emp[0]=new Employee("John",30);
        emp[0]=new Employee();
        emp[0].setAge(30);
        emp[0].setName("John");
        emp[1]=new Employee("Tom",31);
        emp[2]=new Employee("sam",32);
        emp[3]=new Employee("Pam",33);
        emp[4]=new Employee("Kenny",34);
        emp[5]=new Employee("ben",35);
        emp[6]=new Employee("Harold",36);
        emp[7]=new Employee("Das",37);
        emp[8]=new Employee("Ten",38);
        emp[9]=new Employee("Benny",39);

        System.out.println(Arrays.toString(emp));
        for (Employee each:
             emp) {
            System.out.println(each.toString());
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }*/
        Arrays.sort(new int[]{2,1,4,3});

    }

    public static void printElementInArray(int[] a){
        for (int each:
             a) {
            System.out.println(each);
        }
        int[] primaryArray = new int[]{1,2,3};
        int[] secondaryArray=new int[primaryArray.length];
        secondaryArray = Arrays.copyOf(primaryArray,primaryArray.length);
        secondaryArray[2] = 5;

        System.out.println(Arrays.toString(primaryArray));
        System.out.println(Arrays.toString(secondaryArray));





    }

}
