package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // wrapper class example
//        int abc =10;
//        int bc=null;
//        Integer aa = 100;
//        Integer bb = null;

        // define the arraylist
        List<Integer> list1 = new ArrayList<>();

        // add data
        list1.add(20);
        list1.add(44);
        list1.add(21);
        list1.add(12);
        list1.add(3);
        list1.add(50);
        list1.add(20);
        list1.add(44);
        //list1.add(null);

        System.out.println("list1 is : "+list1);

        // remove data
        list1.remove(1);
        System.out.println("list1 after removing 1st index : "+list1);

        // search the list1 at specific position
        System.out.println("list1 value at index 2 : "+list1.get(2));
        System.out.println("list1 value at index 4 : "+list1.get(4));

        // update the list
        list1.set(5,100);
        System.out.println("list1 after updating 5th index : "+list1);

        // size of the list
        System.out.println("list1 size is : "+list1.size());

        // sort the list
        Collections.sort(list1);
        System.out.println("list after sorting : "+list1);

        // traverse the list
        System.out.println("Traversing the list1 using foreach loop");
        for(Integer l1 : list1){
            System.out.println(l1);
        }
    }
}
