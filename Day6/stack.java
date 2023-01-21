import java.util.Stack;

// package Day6;

public class stack {
    public static void main(String[] args) {
        /*
         * The Stack Class 
         * Stack class is derived from vector
         * Stack follows Lifo I.e. last in first out Data Structure.
         * Stack provides method like push() , peek to work with data.
         */

         Stack<String> cakeLayer = new Stack<String>();

         cakeLayer.push("chocolate");
         cakeLayer.push("Vanilla");
         cakeLayer.push("Strawberry");
         cakeLayer.push("Rum-Raisin");
         cakeLayer.push("Tooty-Frooty");

         System.out.println("Total Layers added " + cakeLayer.size());
         System.out.println("The Layer at the top is "+ cakeLayer.peek());
         System.out.println("Eating the Top Layer "+ cakeLayer.pop());
         System.out.println("Layer we are left with " + cakeLayer.size());

         while (cakeLayer.size()>0) {
            System.out.println("Eating all Layer , Currently it is " + cakeLayer.pop());
         }

         System.out.println("Layers we are left with " + cakeLayer.size());


    }
}
