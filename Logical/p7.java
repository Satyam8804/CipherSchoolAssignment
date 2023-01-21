import java.util.Scanner;

// Write a program to calculate the sum of digits of a given number.
//Satyam Kumar (12018969)

public class p7 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int a = s1.nextInt();
        System.out.println("Enter 2nd Number :");
        int b = s1.nextInt();

        int sum = a+b;
        System.out.println("Sum is : " +sum);
    }
}
