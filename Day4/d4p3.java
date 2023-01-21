import java.util.Scanner;

public class d4p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] ={
            {0,0,0,0,0,0},
            {0,0,0,0,1,0},
            {0,0,1,0,1,0},
            {0,1,1,1,1,0},
            {1,1,1,1,1,1}
        };
        int[][] newArr = new int[6][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(arr[i][j]==1){
                    System.out.println("Highest Building is : "+ (j+1));
                    return;
               }
            }
        }
    }
}
