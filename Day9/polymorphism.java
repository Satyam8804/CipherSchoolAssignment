/* 
Polymorphism

Polymorphism is an Ability of An Object to Exist in Multiple Forms.
Types of Polymorphism

1.1 Static Polymorphism : when the Function Call is Known at Compile Tine.
    to imp tement static Polymorphs im we use Function Overloading.

1.2 Dynamic (Runtime) Polymorphism : When the Function call is Determined at Runtime.
    to imp lement Runtime Polymorphism we use Function overriding. */

public class polymorphism {
    // Function Overloading : it is a process of defining multiple 
    //functions with same name but different parameters.

    void add(int n1 , int n2 , int n3){System.out.println(n1+n2+n3);}
    void add(int n1 , int n2 ){System.out.println(n1+n2);}
    void add(float n1 , float n2){System.out.println(n1+n2);}
    void add(int n1 , float n2 ){System.out.println(n1+n2);}
    void add(float n1 , int n2 ){System.out.println(n1+n2);}

    public static void main(String[] args) {
        polymorphism p1 = new polymorphism();
        p1.add(10.0f, 12);
    }

}

