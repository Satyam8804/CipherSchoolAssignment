import java.util.Scanner;

public class D2p1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        System.out.println(n);
        while(n!=1){
            System.out.println(n);
            if(n%2!=0){
                System.out.println( n*3+1);
                n=n*3+1;
            }else{
                System.out.println(n/2);
                n=n/2;
            }

        }
    }
}
