package Day5;

import java.util.ArrayList;

public class collection {
   public static void main(String[] args) {
    /*  
The Collection interface

    -the collection interface is the base interface for List/Queue/Set.
    -this collection is the functionalities for manupulating data.
    -collection interface is the foundation of all other interface.


The List Interface
    -List Interface Contains/Provides Ordered Data.
    -List Interface is the Derived Interface from Collection.
    -List Interface allows Duplicates.

-herbivorus & carnivorous : characteristics
-suppose i have a pet cow & cat :
-category class
-gauri, michan : instances : objects   


--------------------------------------------------------------------------

    ArrayList 

        - Dynamic Data Structure : grow or shrink the size of the Data structure

        - 1.1 Non-Generic Data Structure


*/
    ArrayList grocery = new ArrayList();

    grocery.add("milk");
    grocery.add(10);
    grocery.add(1.24);
    grocery.add(true);


    // Generic Data Structure
    // generic data structure do not allow mixed datatype.
    //they only allow the specified type of data to be added in the collection.

    ArrayList<String> grocery1 = new ArrayList<String>();

    //grocery1.add(10);
    //grocery1.add(20);
    grocery1.add("thirty");

    /*
     *  Advantage of Generic Data Structure is there is not Typecasting in such Collection.
        which adds to performance enhancement of Application.
        Typecasting slows down Apps or Affects Performance of Application.
     */

   } 
}
