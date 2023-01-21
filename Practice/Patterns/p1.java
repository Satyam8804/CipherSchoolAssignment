import java.util.Scanner;

// package Patterns;

public class p1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }
        Scanner sc = new Scanner(System.in);
        char cha = sc.nextLine().charAt(0);
        int x = (int)(cha);
        for (char i = 97; i <= x; i++) {
            for (char j = 97; j <=i; j++) {
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }
}
