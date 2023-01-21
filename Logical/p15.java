import java.util.Scanner;

//Write a   program to calculate  X^(Y+Z) 

public class p15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("X :");
        int x = sc.nextInt();
        System.out.println("Y :");
        int y = sc.nextInt();
        System.out.println("Z :");
        int z = sc.nextInt();
        int Psum = y+z;
        System.out.println(String.format("X^(Y+Z) : %d", (int)Math.pow(x, Psum)));
    }
}
