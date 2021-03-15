package p2q73;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(7);
        al.add(5);
        al.add(16);
        al.add(7);
        al.add(16);
        //remove duplicates from list and display (insertion order should not change)
        LinkedHashSet lhs=new LinkedHashSet(al);
        System.out.println(lhs);
    }
}
