import java.net.SocketImpl;
import java.util.Scanner;

public class D3p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean x = true;
        for (int i = 0; i < str.length(); i++) {
                str = str.replace(',', ' ');
                str = str.replaceAll(" ", ""); 
                int a = Integer.parseInt(String.valueOf(str.charAt(i)));
                if(Integer.valueOf(str)%a==0){
                    x = x && true;
                    }
                else
                {
                   x = x && false;
                }
            }
            if(x==true){
                System.out.println("Happy Number");
            }else{
                System.out.println("Sad Number"); 
            }
        }
    }
