package p2q10;

import P1.Employee;

public class Demo {
    public static void main(String[] args) {
        //create Employee object with 101,sam,1000 data
        //display this object data by passing to show method
        //add 100 bonus in salary
        //display this object data by passing to show method
        Employee e=new Employee(101,"Sam",1000);
        Demo d=new Demo();
        d.show(e);
        e.setSal(e.getSal()+100);
        d.show(e);
    }
    public void show(Employee e){
        //do required changes in show method
        System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
    }
}
