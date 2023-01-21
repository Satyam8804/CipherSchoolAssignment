import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.AttributeSet.ColorAttribute;


//Write a Java program to create a new array list, add some colors (string) and print out the collection.
// Satyam Kumar (12018969)

public class D6p2 {
    public static void main(String[] args) {
        ArrayList<String> color1 = new ArrayList<String>();

        color1.add("Red");
        color1.add("Green");
        color1.add("Blue");

        ArrayList<String> color2 = new ArrayList<String>();
        color2.add("White");
        color2.add("Black");
        
        color1.addAll(color2);
        for (String string : color1) {
            System.out.println(string);
        }
        
    }
}
