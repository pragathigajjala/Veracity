package p2q67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo  {
        public static void main(String[] args) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(10);
            al.add(5);
            al.add(7);
            al.add(9);
            //sort list in descending order using Comparator
            Collections.sort(al,new MyComparator());
            System.out.println(al);
        }
    }
    class MyComparator implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Integer i1=(Integer)o1;
            Integer i2=(Integer)o2;
            if(i1>i2) return -1;
            else if(i1<i2) return +1;
            else return 0;
        }
    }
