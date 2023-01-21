import java.rmi.dgc.VMID;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

// package Day6;

public class vector {
    public static void main(String[] args) {
        
        /*
         * Vector Class
         * vecttor is a dynamic Array
         * 
         * Vector is Syncronised
         */

         Vector<Integer> customerBalance = new Vector<Integer>();

         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < 5; i++) {
            System.out.println(" Hi ! add a new Balance ??");
            customerBalance.add(sc.nextInt());
         }

         Iterator<Integer> balanceFetcher = customerBalance.iterator();

         while (balanceFetcher.hasNext()) {
            System.out.println("Your Account was Updated with " + balanceFetcher.next());
         }
         System.out.println(" Total Trans " +customerBalance.size());
    }
}
