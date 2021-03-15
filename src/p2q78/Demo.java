package p2q78;

import P1.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, "sam", 10000));
        al.add(new Employee(102, "sameer", 2000));
        al.add(new Employee(103, "shyam", 30000));
        al.add(new Employee(104, "ram", 4000));
        al.add(new Employee(105, "ramesh", 15000));
        al.add(new Employee(106, "sameera", 60000));
        //create another arrayList which contains Employees whose salary is more than 5000
        //display new list
        ArrayList al1=new ArrayList(al);
        Iterator itr=al1.iterator();
        while(itr.hasNext())
        {
            Employee o=(Employee)itr.next();
            if(o.getSal()<5000)
                itr.remove();
        }
        System.out.println(al1);
    }
}
