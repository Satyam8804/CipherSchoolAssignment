import java.util.Scanner;

public class d4p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i,j;
        int[] newArr = new int[len];
        for ( i = 0,j =arr.length-1; i < arr.length || j>0; i++,j--) {
            if (i==j) {
                return;
            }
            if(arr[i]>=arr[j]){
                newArr[i] = arr[i];
                newArr[i+1] = arr[j];
                i=i+1;
            }else{
                newArr[i] = arr[j];
                newArr[i+1] = arr[i];
                i=i+1;
            }
        }
        for (int k = 0; k < newArr.length; k++) {
            System.out.print(newArr[k]);
        }
    }
}
