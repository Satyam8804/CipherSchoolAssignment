import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// package Day5;

public class linklist {
    public static void main(String[] args) {
        /*
         * LinkList List implementation
         * 
         * LinkList Implementation the collection Interface
         * Link List uses doubly linkList internally to store the data
         * it allow duplicate elements
         * it is an Ordered Collection.
            Linked has a Faster Performance when Manipulating Elements.
            using Linked List to simulate Employees .
         

         LinkedList<String> metaEmployee = new LinkedList<String>();

         Scanner sc = new Scanner(System.in);

         for (int i = 1; i <=5; i++) {
            System.out.print("Registering Employee No 000" + (i));
            String newEmployee = sc.next();
            metaEmployee.add(newEmployee);
         }

         // we will use iterator to access elements
         // iterator is like a pointer that help us fetch elements

         Iterator<String> pointer = metaEmployee.iterator();
         while (pointer.hasNext()) {
            System.out.println(pointer.next());
         }
         */
        LinkedList<String> scientist = new LinkedList<String>();
        scientist.add("Albert Einstein");
    
        Iterator<String> pointer = scientist.iterator();
        int index =pointer.next().indexOf(" ");
        System.out.println(index);
        // String Name = pointer.next();
        // char F_letter = Name.charAt(0);
        // String lastName = Name.substring(index);
        // System.out.println(String.format("Hello Mr.%s %c",lastName,F_letter));

    }
}
