import java.util.Scanner;

public class d4p2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=1 && n<=Math.pow(10, 6)) {
            String str = Integer.toString(n);
            int count = str.length();
            System.out.println(count);
        }
    }
}
