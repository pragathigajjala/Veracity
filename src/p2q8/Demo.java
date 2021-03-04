package p2q8;

import P1.Employee;

public class Demo{
    public static void main(String[] args) {
    Employee emp = new Employee(101, "sam", 1000);
    Demo.show(emp);
    System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
}
        public static void show(Employee ex) {
            System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
            ex.setId(102);
        }
}
