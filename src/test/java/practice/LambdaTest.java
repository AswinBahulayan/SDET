package practice;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {



    public static void main(String[] args) {
     /*   Runnable nrun=new Runnable() {
            @Override
            public void run() {
                System.out.println("running functional interface");
            }
        };
        Thread thread=new Thread(nrun);
        thread.start();

        Runnable run=()->System.out.println("running using labda implementatin");

        MathOperation operation=(a,b)-> {
           return a + b;
        };
        MathOperation operation1=(a,b)-> a + b;*/

        Employee employee1=new Employee(1,30000,"Google;");
        Employee employee2=new Employee(2,20000,"Amazon;");
        Employee employee3=new Employee(3,60000,"paypal;");

        List<Employee> listemp=new ArrayList<>();
        listemp.add(employee1);
        listemp.add(employee2);
        listemp.add(employee3);
        System.out.println(listemp);
        Comparator<Employee> emp=new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary()<o2.getSalary()){
                    return -1;
                }
                if(o1.getSalary()>o2.getSalary()){
                    return 1;
                }
                return 0;
            }
        };

        Collections.sort(listemp, emp);

        Collections.sort(listemp,(a1,a2)->Integer.compare(a1.getSalary(),a2.getSalary()));
        System.out.println(listemp);


        }



}
