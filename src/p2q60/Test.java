package p2q60;

import P1.Employee;

import java.util.ArrayList;

public class Test {
        public static void main(String[] args){
//create five Employee objects here ,add those objects in ArrayList
// display object data from ArrayList using for loop
            Employee e1=new Employee(101,"Sam",5000);
            Employee e2=new Employee(102,"Liam",6000);
            Employee e3=new Employee(103,"John",7000);
            Employee e4=new Employee(104,"Pop",8000);
            Employee e5=new Employee(105,"Ram",9000);
            ArrayList<Employee> al=new ArrayList<>();
            al.add(e1);
            al.add(e2);
            al.add(e3);
            al.add(e4);
            al.add(e5);
            for(int i=0;i<5;i++)
            System.out.println(al.get(i));
        }
    }


