package p2q34;
import P1.Employee;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        //take data id,name,salary from user using scanner and display that data in show method
        int id,sal;
        String name;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Employee id:");
        id=obj.nextInt();
        System.out.println("Enter Employee name:");
        name=obj.nextLine();
        System.out.println("Enter Employee salary:");
        sal=obj.nextInt();
        Employee e=new Employee();
        e.setId(id);
        e.setName(name);
        e.setSal(sal);
        Demo d=new Demo();
        d.show(e);
    }
    public void show(Employee e){
        //display data here by doing required changes
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
    }
}
