package Collectionspkg;

import P1.Employee;

import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args)
    {
        Employee e=new Employee(1,"Sam",3000);
        Employee e1=new Employee(2,"Ram",5000);
        Employee e2=new Employee(3,"Liam",9000);
        ArrayList al=new ArrayList(3);
        al.add(e);
        al.add(e1);
        al.add(e2);
        ArrayList al2=new ArrayList(3);
        al2.add(e);
        al2.add(e1);
        al2.add(e2);
        System.out.println(e);
        System.out.println(al.size());
        System.out.println(al.contains(e1));
        System.out.println(al.addAll(al2));
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al2);



    }
}
