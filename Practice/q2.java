import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Create a programme to calculate students' total marks, total students, 
//add new students, remove students, highest marks, lowest marks, and so on.
//Create a class called Student, call it into the main class using
// any collection, and then perform the operations listed above.

class Students{
    String name;
    int[] marks;
    int reg;
    int total = 0;
    List<Integer> highList = new ArrayList<>();
    public Students(String name, int[] mark , int reg){
        this.name = name;
        this.marks = mark;
        this.reg = reg;
    }
    
    public void totalMarks(){
        for (int i : marks) {
            this.total += i; 
        }
        System.out.println(String.format("Total marks Scored by %s is %d .",this.name,this.total ));
    }
    public void display(){
        System.out.println("Name :"+this.name);
        System.out.print("Marks :");
        for (int i : this.marks) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Roll :" + this.reg);
    }
    public void highestMark(List<Students> list){
        for (int i = 0; i < list.size(); i++) {
            highList.add(list.get(i).total) ; 
        }
       
            System.out.println("Highest Marks Scored : "+             Collections.max(highList) );
        
    }
        
    
    public void lowestMark(List<Students> list){
        for (int i = 0; i < list.size(); i++) {
            highList.add(list.get(i).total) ;   
    }
   
        System.out.println("Lowest Marks is : "+Collections.min(highList));
      
}
    
}
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Students> list = new ArrayList<Students>();
       
        boolean exit = false;
        while (exit == false) {
            System.out.println("Press 1 , 2 ,3 and 4 to add , remove ,display Students and exit respectively");
            int x= sc.nextInt();
            String[] nameStr;
            int[][] marksEach;
            int[] rNo;
            int len =0;
            if(x==1){
                System.out.println("No. of student you want to add : ");
                int n = sc.nextInt();
                nameStr = new String[n];
                marksEach = new int[n][5];
                rNo = new int[n];
        
                for(int i=0; i<n;i++){
                // take name as input
                    System.out.println("Enter the Name of Student"+i+" : ");
                    nameStr[i] = sc.next();
        
                // taking roll as input
                    System.out.println("Enter the roll no. of student "+i+" :");
                    rNo[i] = sc.nextInt();
        
                    System.out.println("Enter the marks of Student for each Subject  : ");
                    for (int j =0;j<5;j++) {
                        // taking marks as input
                        int mark =sc.nextInt();
                       marksEach[i][j] = mark;
                    }
                }
                for (int i = 0; i < n; i++) {
                    Students s = new Students(nameStr[i],marksEach[i],rNo[i]);
                    list.add(s);
                }
                len = n;
            }else if(x==2){

                System.out.println("Enter the name of student you want to remove : ");
                String strName = sc.next();
                for (int j = 0; j <list.size(); j++) {
                    if(list.get(j).name.contains(strName)){
                     list.remove(list.get(j));
                    }
                 }
            }else if(x==3){
                System.out.println("Total No. of student is "+list.size());
                for (int i = 0; i <list.size(); i++) {
                         list.get(i).display();
                         list.get(i).totalMarks();
                } 
                list.get(list.size()-1).highestMark(list);
                list.get(list.size()-1).lowestMark(list); 
            }
            else if (x==4) {
                exit = true;
                break;
            }
           else{
            System.out.println("Invalid Input .");

            break;
           }
              
            
        }
       
    }
}
