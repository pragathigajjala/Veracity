package p2q24;
import P1.Employee;
public class Demo {
    public static void m1(Employee e){
        //display data here
        System.out.println(e.getId()+" "+e.getName()+" "+ e.getSal());
    }
    public static void main(String[] args) {
        //call m1 method from here
        Employee e=new Employee(101,"Samuel",1000);
        m1(e);
    }
}
