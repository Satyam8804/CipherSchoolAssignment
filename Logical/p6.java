import java.util.Scanner;

// Satyam Kumar (12018969)

public class p6 {
   
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Name of 5 Person :");

        String arr[] = new String[5];
        for (int i=0 ; i<5;i++) {
            arr[i] = s1.nextLine();
        }
        // System.out.println(arr[0].charAt(1));
        for(int i=0; i < 5; i++){  
            for(int j=1; j < 5; j++){  
                     if(arr[j-1].charAt(0)>arr[j].charAt(0)){  
                            String temp;
                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }
            }  
        } 
        for (int i=0 ; i<5;i++) {
            System.out.println(arr[i]);   
             }
    }
}
