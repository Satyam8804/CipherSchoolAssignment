// package Day7;

import java.util.Arrays;
import java.util.stream.Stream;

public class AccessStream {
    public static void main(String[] args) {
        // Accessing Stream Data using forEach loop

        // String[] cart = new String[]{"iPhone","harmonKardon","Aura","JBL","Sony"};

        // Stream<String> cartStream = Arrays.stream(cart);

        // cartStream.forEach(anything->System.out.println(anything));

        // Filtering 

        // Stream<Integer> luckyNumbers = Stream.of(5,4,8,6,9,1,2,3);
        // luckyNumbers.forEach(e->System.out.println(e));

        // Stream<Integer> luckyNumber1 = Stream.of(5,4,8,6,9,1,2,3);

        // System.out.println("Printing Even Number ONLY...");

        // // fetch only even  number

        // Stream<Integer> evenNumbers = luckyNumber1.filter(num->num%2==0);
        // evenNumbers.forEach(e->System.out.println(e));

        Stream<String> person = Stream.of("Satyam","Aditya","Adam","bipul","edward");
        // Stream<String> personWithVowel = person.filter(name ->
        // name.charAt(0)=='a' 
        // || name.charAt(0)=='e'
        // || name.charAt(0)=='i'
        // || name.charAt(0)=='o'
        // || name.charAt(0)=='u'
        // || name.charAt(0)=='A'
        // || name.charAt(0)=='E'
        // || name.charAt(0)=='I'
        // || name.charAt(0)=='O'
        // || name.charAt(0)=='U');

        // personWithVowel.forEach(name->System.out.println(name));

        Stream<String> UpperCaseData = person.map(name->name.toUpperCase());

        UpperCaseData.forEach(item->System.out.println(item));
    }
}
