// package Day3;
import java.util.Scanner;
// Satyam Kumar (12018969)

public class D3p2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total count of team member :");
        int n = sc.nextInt();
        int totalScore =0;  
        int[] Score = new int[n];
        for (int i = 0; i < n-1; i++) {
           Score[i] = sc.nextInt();
            }
        if(Score.length<=11){
            for (int i = 0; i < Score.length-1; i++) {
                totalScore = totalScore + Score[i];
            }
            System.out.println(totalScore);
        }else{
            System.out.println("-1");

        }
      
    }
}
