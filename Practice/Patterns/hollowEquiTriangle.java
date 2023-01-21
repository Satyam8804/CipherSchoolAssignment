// package Patterns;

import java.util.Scanner;

public class hollowEquiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
          
       for (int i = 0; i <n; i++) {
        for (int j =i; j<n-1; j++) {
            System.out.print(" ");
        }
        for (int j =0; j<=i; j++) {
           if(j>0 && i <n-1){
                System.out.print(" ");
           }else{
            System.out.print("*");
           }
        }

        for (int j = 1; j <=i; j++) {
            if(i-j>0 && i<n-1){
                    System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }

        System.out.println();
       } 
    }
    }

