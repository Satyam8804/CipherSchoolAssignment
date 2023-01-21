// package Assignments;

import java.util.Scanner;
import java.util.TreeMap;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman Numerals :");
        String  str = sc.nextLine();
        int sum =0;
        TreeMap<Character , Integer> romanNumber = new TreeMap<Character ,Integer>();

        romanNumber.put('I', 1);
        romanNumber.put('V', 5);
        romanNumber.put('X', 10);
        romanNumber.put('L', 50);
        romanNumber.put('C', 100);
        romanNumber.put('D', 500);
        romanNumber.put('M', 1000);

        int l = str.length();
        for (int i = 0; i < l; i++) {
            if(i !=l-1 && romanNumber.get(str.charAt(i)) < romanNumber.get(str.charAt(i+1)) ){
                sum += romanNumber.get(str.charAt(i+1))-romanNumber.get(str.charAt(i));
                i++;
            }else{
                sum +=romanNumber.get(str.charAt(i))+romanNumber.get(str.charAt(i+1));
            }
        }
        System.out.println(sum);
      
    }
}
