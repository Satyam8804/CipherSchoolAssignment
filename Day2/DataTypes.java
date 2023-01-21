import java.util.Scanner;

public class DataTypes {
public static void main(String[] args) {
    // DataTypes

//Primitive Datatypes - boolean,char, byte, int, long
//Non Primitive DataTypeS -classes,interface , Arrays.

//Understanding Unicode Systen in java.
// -press start button and search character •ap.
// double.

//ASCII : Ancrican standard Code for Information Interchange : this tor US
// ISO 8859-1 : this is character support for european Countries
// KOI-8 : this is for Russian Character support.

// how to find the Asciii code of any given character in java

// char letter = 'A';

// for(int code =91;code<=96;code++){
//     System.out.println(code + " " + (char)code);
// }
// let us solve a mystery
//65 to 90 is A-Z
//97 to 122 is a-z
//then what is 91-96

// int test =12;
// test++;
// System.out.println(test);
// test--;
// System.out.println(test);

// Postfix : eg. var++ ,when the operator is after variable
// Prefix :eg: ++var ,when the operator iS before the variable,

// in the above case  the opression PostFix, in this case
// assignment  of test's value to result happen first.
// later the value of test variable Will be incremented.
// int test =99;
// int result = --test;  // prefix: decrement first ,assignment later 
// System.out.println(test);
// System.out.println(result);

// printing first ?? ot increment/ decrement first??

//  int secret =99;
// System.out.println(++secret);
// System.out.println(++secret);
// System.out.println(secret--);
// System.out.println(++secret);
// System.out.println(++secret);
// System.out.println(++secret);

Scanner sc = new Scanner(System.in);

// java.util is a package : u can compare it to header file in c++.
//Scanner  is a class : this class has functions to take input from user 

// sc: sc is an Object 
//System.in : this represents our keyboard in java , which means we are taking input from keyboard

System.out.println("What is My Name : ");
String name = sc.next();
System.out.println("What is my Hobby : ");
String hobby = sc.next();
System.out.println("What is my Favourite Color ? ");
String color = sc.next();
System.out.println("What is my height ?");
float height = sc.nextFloat();
System.out.println("What is my favourite Coding Language ?");
String code = sc.next();
String msg = String.format("Your Name is  %s, Your height is %f , your favourite color is %s ,Your hobby is %s , your favourite coding Language is %s,",name ,height,color,hobby,code);
System.out.println(msg);


}
    
}


