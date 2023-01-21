import java.util.Scanner;

public class D2p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n;i++){
            for(int k=i;k<n-1;k++){
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print("*_");
                }
            }
            System.out.println();
        }
    }
}
