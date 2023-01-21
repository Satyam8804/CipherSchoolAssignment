

import java.util.stream.Stream;

public class D7p7 {
    public static void main(String[] args) {
            Stream<Integer> list = Stream.of(9,10,3,4,7,3,4).distinct();
            list.forEach(e->System.out.println(e*e));

            
        
    }
}
