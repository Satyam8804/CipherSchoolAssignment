import java.util.Scanner;
// Ques:8
// Write a program to swap the values of two variables using Call by Reference.
// Satyam Kumar (12018969)
public class p8 {
public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the value of X :");
    int x = s1.nextInt();
    System.out.println("Enter the value of Y :");
    int y = s1.nextInt();
    swap(x,y);
  

}
private static void swap(int x, int y) {
    int temp =0;
    temp = x;
    x=y;
    y=temp;
    System.out.println("value of X :" +x);
    System.out.println("value of y :"+y);
}
}