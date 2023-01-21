import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// package Day7;

public class D7p6 {
    public static void main(String[] args) {
        List<String> country = new ArrayList<>(Arrays.asList("USA", "JAPAN", "FRANCE", "GERMANY", "ITALY"," U.K.", "CANADA"));

        String str ="";
        for (String string : country) {
            str = str+string+"-";
        }
        // str.replaceAll(",","-");
        System.out.println(str);
    }
}
