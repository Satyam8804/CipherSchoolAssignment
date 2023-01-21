import java.util.Scanner;

// Satyam Kumar (12018969)
public class p9 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        String str = String.valueOf(n);
        int len = str.length();
        int sum = str.charAt(0)-'0' + str.charAt(len-1)-'0';
        System.out.println(sum);
    }
}
