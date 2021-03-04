package p2q33;

import P1.Employee;

public class Demo {
    public static void show(Employee e){
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
    }
    public static void process(Employee e){
        e.setId(101);
        e.setName("Sam");
        e.setSal(1000);
        show(e);
    }
    public static void main(String[] args) {
        //do required changes in main,process and show method
        //create empty employee object here
        //add data into that empty object using process method
        //display employee object with data in show method
        Employee e=new Employee();
        process(e);
    }
}
