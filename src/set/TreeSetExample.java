package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> set1 = new TreeSet<>();

        set1.add("Mango");
        set1.add("Banana");
        //set1.add(null);
        set1.add("Orange");
        set1.add("Apple");
        set1.add("Mango");

        System.out.println("Set1 is : "+set1);

        set1.remove("Apple");
        System.out.println("set1 after reomve : "+set1);

        System.out.println("traverse");
        for(String s1:set1){
            System.out.println(s1);
        }
    }
}
