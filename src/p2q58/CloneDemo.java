//Create an employee object with some data and create a clone of it and display data from the cloned object.
package p2q58;
import P1.Employee;
public class CloneDemo{
    public static void main(String[] args)
            throws CloneNotSupportedException{
        Employee e1=new Employee(101,"Ram",5000);
        Employee e2=(Employee) e1.clone();
        System.out.println(e2);
    }
}
