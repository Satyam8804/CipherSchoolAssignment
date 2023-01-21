import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// package Day6;

public class hashSet {
    public static void main(String[] args) {
    // Set Interface
    //Set Interface Represents Unordered Collection of elements.
    // Set Interface Doesn't allow Duplicates.
    // Set is Implemented using classes Like HashSet, LinkedHashSet and TreeSet.

    HashSet<String> products = new HashSet<String>();
        products.add("coffee");
        products.add("coffee");
        products.add("coffee");
        products.add("tea");

        System.out.println(products);

        // this class uses LinkList internally to store elements 

        LinkedHashSet<String> products1 = new LinkedHashSet<String>();
        products1.add("coffee");
        products1.add("coffee");
        products1.add("coffee");
        products1.add("tea");

        System.out.println(products1);

        // treeSet sorts the data in ascending order
        // treeSet has better performance then the previous two classes.
        TreeSet<String> products2 = new TreeSet<String>();
        products2.add("coffee");
        products2.add("coffee");
        products2.add("coffee");
        products2.add("tea");

        System.out.println(products1);

    }
}
