import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// package Day7;

public class map {
    public static void main(String[] args) {
        Stream<Integer> weightInPound = Stream.of(110, 145, 180, 174, 192,180);

        // Stream<Double> weightInKg = weightInPound.map(item->item*0.453592);
        // weightInKg.forEach(item->System.out.println(item));

        Optional<Integer> sum = weightInPound.reduce((a,b)->a+b);

        System.out.println(sum);
        // this is how the data is distributed 
        /*
         *  a     b
         * 110   145
         *       180
         *       174
         *       192
         *       180
         */

         // sum of a+b assigned to a
         /*
         *  a     b
         * 110   145
         * 255   180
         * 429   174
         * 621   192
         * 813   180
         * 993
         */

    
        }
}
