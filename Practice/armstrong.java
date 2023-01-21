import java.util.*;

public class armstrong {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfCube = 0;

        String Str = String.valueOf(n);
        for(int i =0 ; i<Str.length(); i++){
            sumOfCube = (int)(sumOfCube + Math.pow( Character.getNumericValue(Str.charAt(i)),3));
        }

        if(sumOfCube == n){
            System.out.println("ArmStrong No.");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
