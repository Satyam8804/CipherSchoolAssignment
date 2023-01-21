import java.util.Scanner;

// package Patterns;

public class hollowTriangle {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
        for (int j =i; j<n; j++) {
            if(i>0 && j>i && i<n-1 && j <n-1){
                System.out.print("  ");
            }else{
                System.out.print("*"+ " ");
            }
        }
        System.out.println();

       } 
    }
}

