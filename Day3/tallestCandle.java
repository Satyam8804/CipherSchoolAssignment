// package Day3;

import java.util.Scanner;

public class tallestCandle {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        // Problem 3
System.out.println("Enter the Number of Candle : ");
int n = inp.nextInt();
int[] candle =new int[n];
for (int  x=0;x<candle.length-1;x++) {
    System.out.println("Enter the height of " + x + " Candle :");
    candle[x] = inp.nextInt();
}
for (int i : candle) {
    for (int j = 0; j < candle.length-1; j++) {
        if(candle[i] > candle[i+1]){
            int temp;
            temp = candle[i];
            candle[i] = candle[i+1];
            candle[i+1]=temp;
    }
   
    }
    // exam26
    // test@26

}

int longest = candle[candle.length-1];
System.out.println(longest);
    }
}
