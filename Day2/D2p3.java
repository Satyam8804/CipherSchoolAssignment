//Satyam Kumar (12018969)
import java.util.Scanner;


public class D2p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print(",");
        int c = sc.nextInt();
        int count=0;
        while(m>=c){
            m = m-c;
            count++;
            if(count%3 == 0){
                count++;
            }
            }
            System.out.println(count);
        }
    }

