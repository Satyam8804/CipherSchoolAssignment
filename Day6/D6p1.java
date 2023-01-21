import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import javax.print.PrintService;

/*
Write a Java Program to Form a KeyVaIue Pair
from tho String Below
prescriptions-Sun Apple,Tue Guava.Wed Grapes ,Thu mango;
Key:Day
Value fruit.
 */
public class D6p1 {
    public static void main(String[] args) {
        String prescription ="Sun Kiwi,Mon Apple,Tue Guava,Wed Grapes,Thu mango";
        String[] items = prescription.split(",");
        for (int i = 0; i < items.length; i++) {
                for (int j = 0; j < items[i].length(); j++) {
                    if(items[i].charAt(j)==' '){
                        System.out.println("Key :" + items[i].substring(0,j));
                        System.out.println("Value :" + items[i].substring(j+1,items[i].length()));
                    }
                }
        }

    }
}
