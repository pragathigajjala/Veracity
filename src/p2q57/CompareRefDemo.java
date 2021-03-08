//Create two employee objects and
//compare it’s references using == and equals
package p2q57;

import P1.Employee;

public class CompareRefDemo {
    public static void main(String[] args){
        Employee e1=new Employee(101,"Ram",5000);
        Employee e2=new Employee(102,"Sam",6000);
        System.out.println(e1.equals(e2)); //false
        System.out.println(e1==e2);//false

        Employee e3=new Employee(101,"Ram",5000);
        Employee e4=new Employee(101,"Ram",5000);
        System.out.println(e1.equals(e2)); //false
        System.out.println(e1==e2);//false
    }
}
