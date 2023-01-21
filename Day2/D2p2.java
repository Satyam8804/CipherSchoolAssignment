import java.util.Scanner;

public class D2p2 {
    
    public static void main(String[] args) {
        String nstr =" ";
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char ch;
        for (int i=s1.length()-1; i>=0; i--)
      {
        ch= s1.charAt(i); 
        nstr= nstr+ch; 
      }
      String s2 = nstr;
      String str =s2.replace('a', '0')
      .replace('e', '1')
      .replace('i', '2')
      .replace('o', '3')
      .replace('u', '4');

      str = str.concat("aca");
      System.out.println(str);
    }
    
}
