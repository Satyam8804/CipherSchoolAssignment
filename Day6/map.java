import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        // The Map Interface Key: Value
        // A Map contains the Data as a Key/VaIue Pair.

        // Map<String , String> states = new HashMap<String ,String>();

        // LinkedHashMap<String , String> states = new LinkedHashMap<String ,String>();

        /*
         * Charscteristics of LinkedHashMap
         * it contains unique element 
         * it is not syncroniZed;
         * it maintains the insertion order 
         * it is internally implemented using a linkedList
         */

         TreeMap<String , String> states = new TreeMap<String ,String>();

         /*
          * Characteristic of TreeMap
          TreeMap contains Unique elements
          TreeMap maintains the Ascending Order
          TreeMap is Non SyncroniZed..
          */

        states.put("AL", "Alabama");
        System.out.println(states);
        states.put("AR", "Arkansas");
        states.put("CA", "California");
        states.put("NY", "NeyYork");
        states.put("TX", "Texas");

        System.out.println(states);

        for (Map.Entry<String , String> pair  : states.entrySet()) {
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
    }
}
