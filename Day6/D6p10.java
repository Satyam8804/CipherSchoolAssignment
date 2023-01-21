import java.util.Iterator;
import java.util.LinkedList;

public class D6p10 {
    public static void main(String[] args) {
        LinkedList<String> color = new LinkedList<String>();

        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        Iterator<String> pointer =color.listIterator(2);
        while(pointer.hasNext()){
            System.out.println(pointer.next());
        }

    }
}
