import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String str1;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u' ) {
            char x= str.charAt(i);
            str = str.replace(x,' ');
        }
        str = str.replace(" ", "");
    }
    System.out.println(str);
    }
}
