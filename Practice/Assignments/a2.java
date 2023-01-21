import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }

        int element = sc.nextInt();
        int idx = 0 ;
        boolean found = false;
        for (int i = 0; i <n; i++) {
            if(arr[i] == element){
                idx +=i;
                found = found || true;
            }else{
                found = found || false;
            }
        }
        if(found == true){
            System.out.println(idx);
        }else{
            System.out.println(-1);
        }
        
    }
}
