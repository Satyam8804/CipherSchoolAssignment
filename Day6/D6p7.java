import java.util.TreeMap;

//Write a Java program to delete all elements from a given Tree Map
//Satyam Kumar (12018969)

public class D6p7 {
    public static void main(String[] args) {
        TreeMap<String , String> states = new TreeMap<String ,String>();

        states.put("AR", "Arkansas");
        states.put("CA", "California");
        states.put("NY", "NeyYork");
        states.put("TX", "Texas");

        states.clear();
        System.out.println(states);

    }
}
