import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class D6p6 {
    public static void main(String[] args) {
        PriorityQueue<String> color = new PriorityQueue<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
        for (int i = 0; i <5; i++) {
            System.out.println("Add Color : ");
            
                String str = br.readLine();
                color.add(str);
            }
        
        while (color.size()>0) {
            System.out.println("Colors are  - " + color.poll());
        }
    }
        catch(Exception e)
        {
            System.out.println("Error while reading data !!!");
        }


    }
}
