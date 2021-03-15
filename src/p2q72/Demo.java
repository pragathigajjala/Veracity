package p2q72;

import P1.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(102, "ram", 2000));
        al.add(new Employee(103, "shyam", 3000));
        al.add(new Employee(101, "sam", 10000));
        al.add(new Employee(104, "sameer", 40000));
        //sort list in descending order of salary using sort method and Comparator
        Collections.sort(al,new MyComparator());
        System.out.println(al);
    }
}
class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        return e2.getSal()-e1.getSal();
    }
}
