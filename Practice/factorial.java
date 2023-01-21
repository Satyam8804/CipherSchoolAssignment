// package Practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Range :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(n>m){
            int factorial =1;
            for (int i = n; i <= m; i++) {
                
                if(i==0){
                    factorial= 1;
                }
               for (int j = 1; j <= n; j++) {
                    factorial=factorial*j;
                    System.out.println(factorial);
               }
               System.out.println(String.format("Factorial of %d is %d", i,factorial));
            }
        } 
    }
}
