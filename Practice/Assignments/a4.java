import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// package Assignments;

public class a4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        List<Integer> list = Arrays.asList(arr);
        Stream<Integer> uniqueList = list.stream().distinct();
                // ArrayList<Integer> newArrayList = uniqueList.collect(Collectors.toCollection(ArrayList::new));
        Integer[] newArray = uniqueList.toArray(Integer[]::new);
        if(newArray.length>2){
            System.out.println(newArray[newArray.length-3]);

        }else{
            System.out.println(newArray[newArray.length-1]);
        }
    
    }
}
