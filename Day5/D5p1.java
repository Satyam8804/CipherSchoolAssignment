//Satyam Kumar (12018969)
import java.util.ArrayList;
import java.util.Scanner;

// package Day5;

public class D5p1 {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 , 2 ,3,4 and 5 to add , delete , List todos ,Select and view Todo and Update todo respectively : ");
        
        boolean exit = true;
        while (exit) {
            System.out.println("Enter the above mentioned key to make Changes you want :");

            int task = sc.nextInt();

            switch (task) {
                case 1:
                    System.out.println("Enter New Todo :");
                    String newData = sc.next();
                    todos.add(newData);
                    break;
                case 2:
                    System.out.println("Enter the Todo You want to delete :");
                    String delete = sc.next();
                    todos.remove(delete);
                case 3:
                    System.out.println("List of All todos are : ");   
                    for (String str : todos) {
                        System.out.println(todos);
                    } 
                    break;
                case 4:
                    System.out.println("Enter the index of todo to view details :");
                    int index = sc.nextInt();
                    System.out.println(todos.get(index)); 
                    break;
 
                case 5:
                    System.out.println("Enter the index of todo you want to view and  Update :");   
                    int indx = sc.nextInt();
                    System.out.println(todos.get(indx));
                    System.out.println("Enter 1 to update :");
                    int update = sc.nextInt();
                    if(update == 1){
                        System.out.println("Enter the new todo :");
                        String newTodo = sc.next();
                        todos.set(indx,newTodo);
                        System.out.println("Updated Successfully !!");
                    }else{
                        System.out.println("Not valid input !!");
                        exit = false;

                    }
                    break;


                default:
                    break;
            }
        }
        

    }
}
