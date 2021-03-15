//Create HashMap<Employee,Integer> and data into it. Make sure duplicate keys are not added.

package p2q83;

import P1.Employee;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Employee,Integer> hm=new HashMap<Employee, Integer>();
        hm.put(new Employee(1,"Sam",2000),101);
        hm.put(new Employee(2,"Liam",3000),102);
        System.out.println(hm);

    }
}
