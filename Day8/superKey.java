/*
 * Super Keyword
 * Super keyword is used to call the constructor of Base class
 */

 class Base{
    Base(int val){
        System.out.println("You provided " + val);
    }
 }
 class Derived extends Base{
    Derived(int val){
        super( val); // this should be the first line of constructor of derived

        System.out.println("Constructor of Derived");

    }
 }
public class superKey {
    public static void main(String[] args) {
        new Derived(10);
    }
}
