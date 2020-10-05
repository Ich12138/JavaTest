package org.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {

        HashSet<Employee> hashSet = new HashSet<Employee>();
        Employee employee1 = new Employee("001", "老大", "第一", 10000.0);
        Employee employee2 = new Employee("002", "老2", "第2", 8000.0);
        Employee employee3 = new Employee("003", "老3", "第3", 6000.0);
        Employee employee4 = new Employee("004", "老4", "第4", 4000.0);
        Employee employee5 = new Employee("005", "老5", "第5", 2000.0);

        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        hashSet.add(employee4);
        hashSet.add(employee5);

        System.out.println("HashSet+++++++++++++++++++++");
        //hashSet遍历Employee
        for (Employee emp : hashSet) {
            System.out.println(emp);
        }


        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee5);
        System.out.println("ArrayList+++++++++++++++++++");
        for (Employee h : arrayList) {
            System.out.println(h);

        }
    }

}
