//Create HashSet of Employees and make sure duplicates are not there
package p2q80;
import P1.Employee;
import java.util.HashSet;
public class Demo {
    public static void main(String[] args) {
        HashSet<Employee> hs=new HashSet();
        hs.add(new Employee(101,"Sam",6000));
        hs.add(new Employee(103,"Liam",8000));
        hs.add(new Employee(102,"Ram",7000));
        System.out.println(hs);

    }
}
