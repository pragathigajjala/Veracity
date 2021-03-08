package p2q32;

import P1.Employee;

public class Demo {
    public static Object m1(){
        //create Employee object here and return
        //don’t change m1 method prototype i.e return type or access specifier
    Employee e=new Employee(1,"Sam",3000);
    return e;
    }
    public static void main(String[] args) {
        //call m1 method and catch returned employee object here
        //display returned employee data here
       Employee e=(Employee)m1();
        System.out.println(e.getId()+" "+e.getName()+" "+ e.getSal());

    }
}
