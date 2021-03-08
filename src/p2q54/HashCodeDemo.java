//Create Employee object and print its hashcode
package p2q54;
import P1.Employee;
public class HashCodeDemo {
        public static void main(String[] args)
        {
            Employee e=new Employee(101,"Sam",4000);
            System.out.println(e.hashCode());//O/p:1828972342
        }
    }

