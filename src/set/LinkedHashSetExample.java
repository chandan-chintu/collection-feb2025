package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        //defining linkedhashset
        Set<String> set1 = new LinkedHashSet<>();

        // adding data into set
        set1.add("Guava");
        set1.add("Mango");
        set1.add("Pineapple");
        set1.add("Apple");
        set1.add(null);
        set1.add("Mango");

        System.out.println("set1 is : "+set1);

        // remove data
        set1.remove("Apple");
        System.out.println("set1 after remove : "+set1);

        // size
        System.out.println("size of set1 : "+set1.size());

        //sort - not poosible in linked hash set beacuse treeset give us the sorting set functionality

        // traverse
        for(String s1 : set1){
            System.out.println(s1);
        }
    }
}
