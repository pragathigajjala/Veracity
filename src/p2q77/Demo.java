package p2q77;
import P1.Employee;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
        public static void main(String[] args) {
            ArrayList<Employee> al = new ArrayList<Employee>();
            al.add(new Employee(101, "sam", 1000));
            al.add(new Employee(102, "sameer", 2000));
            al.add(new Employee(103, "shyam", 3000));
            al.add(new Employee(104, "ram", 4000));
            al.add(new Employee(105, "ramesh", 5000));
            al.add(new Employee(106, "sameera", 60000));
            //create another three arrayLists which contain only id ,name ,salary of these Employees.
            //example ArrayList<Integer> ids = …
            //example ArrayList<String> names= ...
            ArrayList ids=new ArrayList();
            ArrayList names=new ArrayList();
            ArrayList salaries=new ArrayList();
            Iterator itr=al.iterator();
            while(itr.hasNext()){
                Employee e=(Employee)itr.next();
                ids.add(e.getId());
                names.add(e.getName());
                salaries.add(e.getSal());
            }
            System.out.println(ids);
            System.out.println(names);
            System.out.println(salaries);
        }
    }


