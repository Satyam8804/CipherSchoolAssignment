import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// package CodingRound;

public class p1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int thirdLargest=0;
    IntStream arrStream = Arrays.stream(arr);
    int[] arr1 = arrStream.distinct().toArray();
    for (int i=0; i<arr1.length;i++) {
        if(arr1.length>3){
           thirdLargest= arr1[arr1.length-3];
        }else{
          thirdLargest =  arr1[0];
        }
    }
    System.out.println(thirdLargest);
    
   } 
}
