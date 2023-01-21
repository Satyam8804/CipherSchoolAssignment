import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int j =0;
        String fString ="";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) ==' ' || str.charAt(i)==str.charAt(str.length()-1)) {
                String substr = str.substring(j, i);
           
                String str2 = "";
               
                for (int j2 = substr.length()-1; j2>=0; j2--) {
                    str2 = str2 + substr.charAt(j2);
                }
                substr = substr.replace(substr, str2);
                fString = fString+substr+ " ";
                j=i+1; 
            }else {
                continue;
            }
        }
        System.out.println(fString);
    }
}
