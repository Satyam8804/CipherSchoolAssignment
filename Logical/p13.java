import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Matrix :");
        int m =sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            System.out.print(String.format("[%d][%d] : ", i,j));
            matrix[i][j]= sc.nextInt();
            }

        }
        int sum =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum = sum + matrix[i][j];
            }

        }

        System.out.println(sum);

    }
}
