package Homework;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    @Test
    public void test(){
        Map<Integer, Employee> map = getEmployeeMap();
        for (Map.Entry<Integer,Employee> each:
             map.entrySet()) {
            System.out.println("Employee #------# "+each.getKey());
            System.out.println("Employee name : "+each.getValue().getName());
            System.out.println("Employee name : "+each.getValue().getCompanyName());
            System.out.println("Employee name : "+each.getValue().getSalary());
            System.out.println("Employee name : "+each.getValue().getEmpId());
        }
    }

    private static Map<Integer, Employee> getEmployeeMap() {
        Map<Integer,Employee> map=new HashMap<>();
        Employee emp1=new Employee();
        emp1.setEmpId(1001);
        emp1.setName("John");
        emp1.setSalary(100000);
        emp1.setCompanyName("Paypal");
        map.put(emp1.getEmpId(),emp1);
        Employee emp2=new Employee();
        emp2.setEmpId(1002);
        emp2.setName("Antony");
        emp2.setSalary(200000);
        emp2.setCompanyName("Amazon");
        map.put(emp2.getEmpId(),emp2);
        Employee emp3=new Employee();
        emp3.setEmpId(1003);
        emp3.setName("Sam");
        emp3.setSalary(300000);
        emp3.setCompanyName("Harold");
        map.put(emp3.getEmpId(),emp3);
        return map;
    }
}
