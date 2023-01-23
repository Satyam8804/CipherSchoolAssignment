import java.util.ArrayList;
import java.util.List;

public class p1 {

    public static void main(String[] args) {
        int a = 6;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <=6; i++) {
            if(a%i==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}