package p2q31;

import P1.Employee;

public class Demo {
    public static Object m1(){
        //create Employee object here and return
        //don’t change m1 method prototype i.e return type or access specifier
    Employee e=new Employee(101,"Sam",1000);
        return e;
    }
    public static void main(String[] args) {
        //call m1 method and catch returned employee object here
        //display returned employee data here
        Employee e1=(Employee)m1();
        System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSal());
    }
}
