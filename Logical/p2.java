import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n = s1.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter all entries :");
        for (int i=0;i<n; i++) {
            arr[i]=s1.nextInt();
        }
        int temp=0;

        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(arr[j-1] > arr[j]){  

                            temp = arr[j-1];  
                            arr[j-1] = arr[j];  
                            arr[j] = temp;  
                    }  
                     
            }  
    } 
        System.out.println("Maximun Number : " + arr[n-1]);
        System.out.println("Minimum Number :" +arr[0]);
    }
}
