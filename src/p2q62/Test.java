package p2q62;
import P1.Employee;
import java.util.Enumeration;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
 //create five Employee objects here.add those objects in Vector
//display object data from Vector using Enumeration
        Employee e1=new Employee(101,"Sam",5000);
        Employee e2=new Employee(102,"Liam",6000);
        Employee e3=new Employee(103,"John",7000);
        Employee e4=new Employee(104,"Pop",8000);
        Employee e5=new Employee(105,"Ram",9000);
        Vector<Employee> v=new Vector<>();
        v.add(e1);
        v.add(e2);
        v.add(e3);
        v.add(e4);
        v.add(e5);
        Enumeration e=v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
        }

    }