package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //definfing treemap
        TreeMap<Integer, String> map1 = new TreeMap<>();
// some lines
        // some lines
        // adding
        map1.put(104,"Mango");
        map1.put(103,"Guava");
        map1.put(102,"Apple");
        map1.put(101,"Orange");
        //map1.put(null,"Pineapple");
        map1.put(105,null);
        map1.put(107,null);
        map1.put(106,"Banana");
        map1.put(102,"Orange");// this is the latest value for 103 so orange is considered
        map1.put(101,"Apple");// this is the latest value for 104 so Apple is considered

        System.out.println("map1 is : "+map1);

        map1.remove(106);
        System.out.println("map1 after remove : "+map1);

        System.out.println("map1 value of key 102 is : "+map1.get(102));
        // traversing
        System.out.println("Traverse the map");
        for(Map.Entry m1 : map1.entrySet()){
            System.out.println(m1.getKey() +"-----------"+m1.getValue());
        }
    }
}
