import java.util.Scanner;

// package Practice;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        String newStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            newStr = newStr+ str.charAt(i);
        }
        // str = newStr;
        System.out.println(Integer.parseInt(newStr));
    }
}
