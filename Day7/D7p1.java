//Satyam Kumar (12018969)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// package Day7;

public class D7p1 {
    public static void main(String[] args) {
        String[] list = {"abc","","bcd","","defg","jk"};
        int count =0;
        int count3=0;
        int countA=0;
        List newList =new ArrayList<>();
        List newList1 =new ArrayList<>();


        for (int i = 0; i < list.length; i++) {
           if(list[i].length()==0){
            count++;
            
           }else if(list[i].length()>3){
           
            count3++;
           }else if(list[i].charAt(0)=='a'){
                countA++;
           }

           if(list[i].length()!=0){
            newList.add(list[i]);
           }
           if(list[i].length()>=3){
            newList1.add(list[i]) ;
           }
        }


        System.out.println("it has "+count+" empty string .");
        System.out.println(String.format("it has %d string of length more than 3",count3));
        System.out.println(String.format("it has %d string startsWith 'a'",countA));
        System.out.println("List without Empty String :"+ newList);
        System.out.println("filtered list :"+ newList1);
    }
}
