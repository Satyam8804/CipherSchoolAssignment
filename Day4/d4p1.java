import java.util.Scanner;

// Satyam kumar (12018969)
public class d4p1 {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size :");
    int n = sc.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
    }
    int j=0;
    while (j<3) {
        remove(array);
    }
   }

public static void findLargest(int[] array,int n) {
    int n1 = n;
    for (int i = 0; i < n-1; i++) {
        if(array[i] > array[i+1]){
            int temp;
            temp = array[i];
            array[i] = array[i+1];
            array[i+1] = temp;
        }
    }
    remove(array);
    if (array.length ==n1-2 ) {
        System.out.println(array[n-1]);
        return;
    }
    
}

private static void remove(int[] array) {
    int len = array.length;
    findLargest(array,len-1);
}

}
