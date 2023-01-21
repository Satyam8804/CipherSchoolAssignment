
// package Day8;

/*
 * This program Explains Inheritance
    Inheritance allows us to acquire properites & Methods of one class into Another
    Advantages of Inheritance are
    --Code Reusability
    --Memory Optimization
    --fast Development etc.

    java provided extends keyword to Inherit a class.
    Java doesn't supports multiple Inheritance i.e inheriting more then 1 class isn't supported.
 */

 class Father{
    Father(){
        System.out.println("Constructor of Base");
    }
    void foodHabbit(){
        System.out.println("I like Salty ");
    }
 }

 class Son extends Father{
    Son(){
        System.out.println("Constructor of Derived .");
    }
 }

public class inheritance {
    public static void main(String[] args) {
        Son peter = new Son();
        peter.foodHabbit();
    }
}
