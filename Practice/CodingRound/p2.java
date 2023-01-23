import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.plaf.synth.SynthLookAndFeel;

// package CodingRound;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");

        int number = sc.nextInt();
        int[] array = new int[number];
  
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < array.length; i++){
            int value = sc.nextInt();              
            stack.push(value);
        }   
        Iterator<Integer> pointer = stack.iterator();
        int j=0;
        while (!pointer.hasNext()) {
           System.out.println(stack.pop()); 

        }

        Arrays.sort(array);
        Stack<Integer> newStack =new Stack<>();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            int element = array[i];
            newStack.push(element);
        }
        System.out.println(newStack);
    }
}
