import java.util.Scanner;

// Satyam Kumar (Satyam8804378323@gmail.com)

public class p {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a Lower bound:");
        int a = s1.nextInt();
        System.out.println("Enter a upper bound:");
        int b = s1.nextInt();

        
        int i =a;
        while(i<b){
            if(i >=1 || i<=b){
                System.out.println(i +"--->");
                if(i%3==0 & i%5==0){
                    System.out.println("FunTask");
                }else if(i%3==0){
                    System.out.println("Fun");
                }
                else if(i%5==0){
                    System.out.println("Task");
                }
            }else{
                System.out.println("Number out of Range");
            }
            i=i+1;
        }

        }
      
    }
    

