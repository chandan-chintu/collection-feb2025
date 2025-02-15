package list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // define stack
        Stack<String> stck1 =  new Stack<>();

        // pushing into stack is adding data into stack
        stck1.push("apple");
        stck1.push("guava");
        stck1.push("banana");
        stck1.push("pineapple");
        stck1.push("orange");
        stck1.push("banana");

        System.out.println("stck1 is : "+stck1);

        // pop - remove data from stack

        stck1.pop();
        System.out.println("stck1 after 1st pop : "+stck1);
        stck1.pop();
        System.out.println("stck1 after 2nd pop : "+stck1);

        System.out.println("traverse stck1 ");
        for (String s1 : stck1){
            System.out.println(s1);
        }
    }
}
