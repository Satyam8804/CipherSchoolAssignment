// package Day5;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> shopping_cart = new ArrayList<String>();
        System.out.println("Total Product Count in Cart " + shopping_cart.size());

        // let add Element
        shopping_cart.add("iphone");
        shopping_cart.add("Airpod");
        shopping_cart.add("charger");
        shopping_cart.add("dvd");
        shopping_cart.add("watch");

        System.out.println("Total Product Count in Cart " + shopping_cart.size());

        // remove element

        shopping_cart.remove("dvd");

        System.out.println("Total Product Count in Cart " + shopping_cart.size());

        // emhanced for loop

        for (String product : shopping_cart) {
            System.out.println("You added " + product);
        }
    }

}
