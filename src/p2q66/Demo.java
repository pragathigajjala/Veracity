package p2q66;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(5);
        al.add(7);
        al.add(9);
        //sort  list in descending order (use reverse function)
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
    }
}

