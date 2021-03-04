package p2q3;
import P1.Employee;
public class Demo {
    public static void main(String[] args) {
        //here create object of Employee class and add 101,sam,1000 data into that using setter method
        //display that data here
    Employee e=new Employee();
    e.setId(1);
    e.setName("Sam");
    e.setSal(1000);
    System.out.println("empId:"+e.getId()+" "+"empName:"+e.getName()+" "+"empSal:"+e.getSal());
    }
}
