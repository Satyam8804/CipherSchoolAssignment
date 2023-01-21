// import java.sql.Array;
import java.util.Arrays;
// import java.lang.reflect.Array;

// package Day3;

public class string {
    public static void main(String[] args) {
        String animal = "crocodile";
        // experiment
        // animal[4]="a"; // Error : coz String is immutable Data structure (Read Only)

        // .charAt(index) : this function lets us access a character at given index

        System.out.println(animal.charAt(1));

        // using for loop to access all element using .charAt()

        for (int i = 0; i < animal.length(); i++) {
            System.out.println(animal.charAt(i));
        }

        // converting a string int character array using .toCharArray()
        char[] letters = animal.toCharArray();
        System.out.println(Arrays.toString(letters));
        // the advantage of converting a string to character array is that we can update value in char array

        letters[4] ='a';
        System.out.println(Arrays.toString(letters));

        //converting char array to string 
        String newAnimal = new String(letters);
        System.out.println(newAnimal);
    }
}
