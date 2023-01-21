// package Practice;
import java.util.*;

public class palindrome {
    public int reverse(int n){
        String str = Integer.toString(n);
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            newStr = newStr+ str.charAt(i);
        }
        // str = newStr;
        int newInt = Integer.valueOf(newStr);
        return newInt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            int x = reverse(i);

        }
    }
}
