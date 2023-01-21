import java.util.Scanner;

//Write a Program to Accept character and display its Ascii value and its Next and Previous Character. 

public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        int n = (int)ch;
        System.out.println(String.format("ASCII value : %d ,Next Character :%c , Previous char is : %c" , n,(char)(n+1),(char)(n-1)));
    }
}
