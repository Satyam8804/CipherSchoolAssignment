import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = Integer.toString(a);
        int sum =0;
        if(str.length()!=4){
            System.out.println("Invalid Number .");
        }else{

            for (int i = 0; i < str.length(); i++) {
                sum =sum + (str.charAt(i)-'0');
            }
            if(sum%3==0 || sum %5 ==0 || sum %7 ==0){
                System.out.println("Lucky Number");
            }else{
                System.out.println("Invalid Number .");
            }
        }
    }
}
