import java.util.Scanner;

public class D8p1 {
    public static void main(String[] args) {
        int[] grades = new int[20];
        Scanner sc = new Scanner(System.in);
       
        int stop = sc.nextInt();
        int size =0;
            for (int i = 0 ;i<20;i++) {
                grades[i] = sc.nextInt(); 
                size++;
                if(grades[i] == -1) {
                    break;
                }
            }
        System.out.println(average(grades,size));

        }

    private static double average(int[] grades,int size) {
        int sum =0;
        for (int i= 0 ;i<size-1;i++) {
            sum +=grades[i];
        }
        return sum/(size-1);
    }
}
