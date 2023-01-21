
import java.util.Scanner;

public class D3p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        for (int i = 0; i <str.length(); i++) {
            str = str.replaceAll("[^a-zA-Z]", "");

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
          
                str = str.replace(str.charAt(i), (char)(str.charAt(i) - 32));

            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                str = str.replace(str.charAt(i), (char)(str.charAt(i) + 32));
        }
        System.out.println(str);
    }   
           }


    
