import java.util.ArrayList;
import java.util.List;

class Number{
    private double x;
    Number(int x){
        this.x =x;
    }

    public boolean isZero(int x){
        if(x ==0){
            return true;
        }
        return false;

    }
    public boolean isPositive(int x){
        if(x>0){
            return true;
        }
        return false;

    }
    public boolean isNegative(int x){
        if(x<0){
            return true;
        }
        return false;
    }

    public boolean isOdd(int x){
        if(x%2==0){
            return false;
        }
        return true;
    }
    public boolean isEven(int x ){
        if(isOdd(x) != true){
            return true;
        }
        return false;
    }
    public boolean isPrime(int x){
        if (x <= 1) {  
            return false;  
        }  
        for (int i = 2; i < Math.sqrt(x); i++) {  
            if (x % i == 0) {  
                return false;  
            }  
        }  
        return true;  
    }  
     
    public boolean isAmstrong(int x){
        int sumOfCube = 0;

        String Str = String.valueOf(x);
        for(int i =0 ; i<Str.length(); i++){
            sumOfCube = (int)(sumOfCube + Math.pow( Character.getNumericValue(Str.charAt(i)),3));
        }

        if(sumOfCube == x){
            return true;
        }else{
            return false;
        }
    }
    public double getFactorial(int x){
        if(x==0 || x == 1){
            return 1;
        }
        return getFactorial(x-1);
    }
    public double getSqrt( ){
        return Math.sqrt(x);

    } 
    public double getSqr(){
        return x*x;
    }
    
    public double sumDigits(){
        int sum =0;
        int digit;
        while(x >0){
            digit = (int)(x % 10);
            sum = (int) (sum + digit);
            x = x/10;
            
        }
        return sum;

    } 
    public double getReverse( ){
        
        String str = String.valueOf((int)x);
        String strRev ="";

        for (int i = str.length()-1; i >=0; i--) {
            strRev += str.charAt(i);
        }
        return Double.valueOf(strRev);

    }

    void listFactor(){
        List<Integer> listFactor = new ArrayList<Integer>();
        double x2 = x;
        for (int i = 0; i < x2; i++) {
            if(x % i==0){
                listFactor.add(i);
            }
        }
        System.out.println(listFactor);
    }
    void dispBinary(){
        System.out.println(Integer.toBinaryString((int)x));
    }

}

public class D9p5 extends Number{
    D9p5(int x) {
        super(x);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Number n1 = new Number(153);
        // System.out.println(n1.isAmstrong(153) );
        // System.out.println(n1.sumDigits());
        // System.out.println(n1.getReverse());
        n1.listFactor();
        n1.dispBinary();
        
    }
}
