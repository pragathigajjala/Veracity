package p2q25;
import P1.Employee;

public class Demo {
    public static void m1(Object o){
        //display employee data here
        Employee e1=(Employee)o;
        System.out.println(e1.getId()+" "+e1.getName()+" "+ e1.getSal());
    }
    public static void main(String[] args) {
        //create Employee object here with 101,sam,1000 data
        //call m1 method by passing this Employee object
        Employee e=new Employee(101,"Sam",1000);
        m1(e);
    }
}
