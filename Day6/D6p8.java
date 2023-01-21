import java.util.TreeSet;
//Write a Java program to add all the elements of a specified tree set to another tree set
//Satyam kumar(12018969)
public class D6p8 {
    public static void main(String[] args) {
        TreeSet<String> product = new TreeSet<String>(); 
        product.add("coffee");
        product.add("tea");

        TreeSet<String> product1 = new TreeSet<String>();
        product.add("Biscuit");
        product.add("sweets");

        

        System.out.println(product.equals(product1));
    }
}
