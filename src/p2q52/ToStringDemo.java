//Create Employee Object and display it’s data using toString that is only print e
// and it should display all the data of that object
package p2q52;
import P1.Employee;
public class ToStringDemo {
    public static void main(String[] args)
    {
        Employee e=new Employee(101,"Sam",5000);
        System.out.println(e);//o/p: 101 Sam 5000
    }
}
