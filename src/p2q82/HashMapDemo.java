//Create hashMap with String key and Integer value and add some data into it.
// And display data from hashMap. Don’t use System.out.println(h)
package p2q82;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Telugu", 90);
        hm.put("Hindi", 80);
        hm.put("English", 85);
       // System.out.println(hm);
        for(Map.Entry m:hm.entrySet())
            System.out.println(m.getKey()+":"+m.getValue());
    }
}

