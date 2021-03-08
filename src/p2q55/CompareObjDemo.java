//Create two employee objects with same data and compare two object(data)
package p2q55;
import P1.Employee;

public class CompareObjDemo {
    public static void main(String[] args)
    {
        Employee e1=new Employee(101,"Sam",4000);
        Employee e2=new Employee(101,"Sam",4000);
        System.out.println(e1.equals(e2));//true
        System.out.println(e1==e2);   //false

    }
}
