import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 =sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        double sum =0;
        int tlen = n1+n2;
        for (int i = 0; i < tlen; i++) {
            if(i<n1){
                sum = sum +arr1[i];
            }else{
                sum = sum +arr2[i-n1];
            }
        }

        System.out.println(sum/tlen );
    }
}
