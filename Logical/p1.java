// Satyam Kumar (Satyam8804378323@gmail.com)

import java.util.Scanner;

public class p1 {
     public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 4 digit Number");
        int a = s1.nextInt();
       int zero=0,odd =0,even=0;
        String s2 = Integer.toString(a);
        for (int i = 0; i < s2.length(); i++) {
            char s3 = s2.charAt(i);
            int b = s3 -'0';
             if(a==0){
                zero= zero+1;
             }
             if (b%2==0) {
                even=even+1;
             }
             if(b%2!=0){
                odd =odd+1;
             }
        }

        System.out.println("Zeros :"+ zero);
        System.out.println("Even :"+ even);
        System.out.println("Odds :"+ odd);


    }
}
