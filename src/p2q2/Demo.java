package p2q2;

import P1.Employee;
public class Demo {
    public static void main(String[] args) {
        //here create object of Employee class and add 101,sam,1000 data into that
        //display that data here
        Employee e = new Employee(1, "Sam", 1000);
        System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
    }
}
