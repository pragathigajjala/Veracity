package p2q30;

import P1.Employee;

public class Demo {
    public static Employee m1(){
        //create Employee object here and return
        //do required changes in m1 method to do this task
        Employee e=new Employee(101,"Sam",1000);
        return e;
    }
    public static void main(String[] args) {
        //call m1 method and catch returned employee object here
        //display returned employee data here
        Employee e1=m1();
        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSal());

    }
}
