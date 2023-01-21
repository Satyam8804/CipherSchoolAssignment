import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]= sc.nextInt();
        }
        
        for (int i = 0; i < array.length-1; i++) {
            int count =1;
            for (int j = 1; j < array.length; j++) {
                if(i!=j){
                    if(array[i] == array[j]){
                        count++;
                    }
                }
            }
            System.out.println(String.format("Count of %d : %d" ,array[i],count));

            count=1;
        }
        
    }
}
