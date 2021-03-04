package p2q7;

import P1.Employee;

public class Demo{
    public static void main(String[] args) {
        //here create two objects of Employee class and add  data into that
        //call show method and pass this two objects to show method
        Employee e1=new Employee(1,"Sam",1000);
        Employee e2=new Employee(2,"Liam",2000);
        Demo.show(e1);
        Demo.show(e2);
    }
    public static void show(Employee e){
        //do required changes to show method and display that data here
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
    }
}
