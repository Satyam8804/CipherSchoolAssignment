import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Satyam kumar (12018969)
public class D3p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of candidates passed in 1st , 2nd and 3rd rounds respectively :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String[] str1 = new String[a];
        String[] str2 = new String[b];
        String[] str3 = new String[c];
        int min1 = Math.min(a, b);
        int min2 =Math.min(b, c);
        int min =Math.min(min2, min1);
        String[] str = new String[min];
        System.out.print("Enter the Name of Candidate passed 1st Round :");
        for (int i = 0; i < a; i++) {
            str1[i] = sc.nextLine();
        }
        System.out.print("Enter the Name of Candidate passed 2nd Round :");
        for (int i = 0; i < b; i++) {
            str1[i] = sc.nextLine();
        }
        System.out.print("Enter the Name of Candidate passed 3rd Round :");
        for (int i = 0; i < c; i++) {
            str1[i] = sc.nextLine();
        }
        int max1 = Math.max(a, b);
        int max2 =Math.max(b, c);
        int max =Math.max(max2, max1);
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if(str1[i] == str2[j]){
                    String s =str1[i];
                    for (int k = 0; k < str3.length; k++) {
                        if(str3[k] == s){
                            List<String>l = new ArrayList<String>(  
                            Arrays.asList(str));  
                            l.add(s); 
                            str = l.toArray(str);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < str.length-1; i++) {
            System.out.println(str[i]);
        }
    }
}
