import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class D6p5 {
    public static void main(String[] args) {
        Set<String> products = new HashSet<String>();
        products.add("coffee");
        products.add("coffee");
        products.add("coffee");
        products.add("tea");

        System.out.println(" HashSet : " + products);

        Set<String> hashSetToTreeSet= new TreeSet<String>(products);
        System.out.println(hashSetToTreeSet);
    }
}
