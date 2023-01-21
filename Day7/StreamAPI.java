import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

// package Day7;

public class StreamAPI {
    public static void main(String[] args) {
        //Java Stream API
//Stream Refers to the set of Built In Functions that lets us Process the Data
// Quickly and Faster.

//This Primarily known as Functional Programming.
// The Primary Motive of using Streams API is to "DO MORE WITH LESS LINES OF CODE"
//STREAM API let us write Codes that are
//short/Simple/ faster/ elegant/


//Let us learn how we can Create Streams & Work with Streams.

//Here is an Example that Creates and Empty Stream.

        // Stream<String> emptyStream = Stream.empty();

        // Other methods of creating Stream.
        // we can create stream from arrays
        /* 
        Collection<String> courses = Arrays.asList("JAVA","PHP","DotNet","C#","jQuery");

        Stream<String> coursesStream = courses.stream();
        System.out.println(coursesStream);
        
        */

        Stream<String>  colors = Stream.of("Red","Green","MagicBlack","Purple");

        //Creating stream from existing array

        String[] cart = new String[]{"iPhone","harmonKardon","Aura","JBL","Sony"};

        Stream<String> cartStream = Arrays.stream(cart);

        // using StreamBuilder to create Stream

        Stream<String> beverages = Stream.<String>builder().add("Coffee").add("Tea").add("Juice").build();

        //Stream.Generate()

        Stream<String> emojis = Stream.generate(()->"^_^").limit(10);
        // in the above code the generate() generate the given String i.e. emoji 10 times.

        emojis.forEach(i->System.out.println(i));
    }
}
